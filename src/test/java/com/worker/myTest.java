package com.worker;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class myTest {


   // @Test
    public  void tests() throws Exception {
        List<String> warning=new ArrayList<String>();
        boolean overwrite=true;
        File configfile=new File("generatorConfig.xml");
        ConfigurationParser cp=new ConfigurationParser(warning);
        Configuration config=cp.parseConfiguration(configfile);
        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,callback,warning);
        myBatisGenerator.generate(null);
    }
}
