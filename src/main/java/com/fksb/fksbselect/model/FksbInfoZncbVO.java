package com.fksb.fksbselect.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class FksbInfoZncbVO {
    @NotEmpty
    @NotNull
    private String equiId;

    private String equiLoc;

    private BigDecimal homeAre;

    private String  waterType;

    private String  householdName;

    private String   phone;


    public String getEquiId() {
        return equiId;
    }

    public void setEquiId(String equiId) {
        this.equiId = equiId;
    }

    public String getEquiLoc() {
        return equiLoc;
    }

    public void setEquiLoc(String equiLoc) {
        this.equiLoc = equiLoc;
    }

    public BigDecimal getHomeAre() {
        return homeAre;
    }

    public void setHomeAre(BigDecimal homeAre) {
        this.homeAre = homeAre;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public String getHouseholdName() {
        return householdName;
    }

    public void setHouseholdName(String householdName) {
        this.householdName = householdName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
