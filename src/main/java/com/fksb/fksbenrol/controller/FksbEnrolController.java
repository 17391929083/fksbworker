package com.fksb.fksbenrol.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fksb.fksbenrol.model.FksbInserModel;
import com.fksb.fksbenrol.model.FksbenrolVO;
import com.fksb.fksbenrol.model.WtAdBVO;
import com.fksb.fksbenrol.service.FksbEnrolService;
import com.fksb.supportmothord.model.WtAdVillageVO;
import com.fksb.utill.WeiXinInfoUtill;
import com.sun.istack.internal.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Controller
@RequestMapping("fksbEnrolController")
public class FksbEnrolController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private FksbEnrolService fksbEnrolService;

    @Autowired
    private HttpSession session;


  /*页面跳转*/
  @RequestMapping("index")
  public ModelAndView  index(){
      ModelAndView view=new ModelAndView();
      view.setViewName("/enrol/enrol");
      return view;
    }

    /*水表注册页面数据*/
    @PostMapping("seleFksbEntron")
    @ResponseBody
    public JSONObject  seleFksbEntron(){
        Map<String,Object> map=new HashMap<String,Object>();
        FksbenrolVO fksbenrolVO  = fksbEnrolService.selectAdAre(session.getAttribute("orgCd").toString());
        session.setAttribute("adCd",fksbenrolVO.getAdCd());
        map.put("fksbenrolVO",fksbenrolVO);
        return (JSONObject) JSONObject.toJSON(map);
    }

    /*水表注册页面村*/
    @PostMapping("selectVillageNm")
    @ResponseBody
    public JSONObject  selectVillageNm(String townId){
        Map<String,Object> map=new HashMap<String,Object>();
        List<WtAdVillageVO> wtAdVillageVOS = fksbEnrolService.selectVillageNm(townId);
        map.put("villList",wtAdVillageVOS);
        return (JSONObject) JSONObject.toJSON(map);
    }


    //注册数据提交
    @PostMapping("insertFksbData")
    @ResponseBody
    public JSONObject  insertFksbData(FksbInserModel fksbInserModel){
        Map<String,Object> map=new HashMap<String,Object>();
        fksbInserModel.setAdCd(session.getAttribute("adCd").toString());
        fksbInserModel.setOrgCd(session.getAttribute("orgCd").toString());
        fksbInserModel.setMpUser(session.getAttribute("fromUserName").toString());
        boolean boolen = fksbEnrolService.isNullEquiid(fksbInserModel);
        if(boolen){
            map.put("iniseSign",-1);//设备已存在
        }else{
            session.setAttribute("fksbInserModel",fksbInserModel);
            map.put("iniseSign",0);//成功
        }

        return (JSONObject) JSONObject.toJSON(map);
    }







   /*返回微信配置参数*/

    @ResponseBody
    @RequestMapping("getWxArgs")
    public JSONObject getWxArgs(HttpServletRequest request){


        JSONObject jsonObject = WeiXinInfoUtill.selWeixin(request);
        System.out.println(jsonObject);

        return  jsonObject;
    }



    /*查询redis 获取截取规则*/

    @ResponseBody
    @RequestMapping("getequiidrule")
    public JSONObject getequiidRule(HttpServletRequest request){
        String orgCd = session.getAttribute("orgCd").toString();
        //从redis中查询规则
        Map<String, Object> map = fksbEnrolService.getequiidRule(orgCd);

        return  (JSONObject) JSONObject.toJSON(map);
    }


    @ResponseBody
    @RequestMapping("fksbEnrol")
    public JSONObject fksbEnrol() throws InterruptedException {

        if ("610502053".equals(session.getAttribute("orgCd").toString())){
            Thread.sleep(10000);
            logger.info(session.getAttribute("orgCd").toString());
        }

        return (JSONObject) JSONObject.toJSON("346546");
    }







}
