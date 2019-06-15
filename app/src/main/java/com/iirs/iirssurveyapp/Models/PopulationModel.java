package com.iirs.iirssurveyapp.Models;

import com.google.gson.annotations.SerializedName;

public class PopulationModel {
    @SerializedName("Ward No")
    private int wardno;
    @SerializedName("Area Type")
    private String areatype;
    @SerializedName("Total People")
    private int totalpeople;
    @SerializedName("Total Males")
    private int totalmale;
    @SerializedName("Total Females")
    private int totalfemale;
    @SerializedName("Total Literate People")
    private int peopleliterate;
    @SerializedName("Total Literate Males")
    private int maleliterate;
    @SerializedName("Total Literate Females")
    private int femaleliterate;
    @SerializedName("Total Illiterate People")
    private int peopleilliterate;
    @SerializedName("Total Illiterate Males")
    private int maleilliterate;
    @SerializedName("Total Illiterate Females")
    private int femaleilliterate;
    @SerializedName("Total Working People")
    private int totalworkingpeople;
    @SerializedName("Total Working Males")
    private int totalworkingmale;
    @SerializedName("Total Working Females")
    private int totalworkingfemale;
    @SerializedName("Total Non Working People")
    private int nonworkingpeople;
    @SerializedName("Total Non Working Males")
    private int nonworkingmale;
    @SerializedName("Total Non Working Females")
    private int nonworkingfemale;


    public void setWardno(int wardno) {
        this.wardno = wardno;
    }

    public int getWardno() {
        return wardno;
    }

    public void setAreatype(String areatype) {
        this.areatype = areatype;
    }

    public String getAreatype() {
        return areatype;
    }

    public void setTotalpeople(int totalpeople) {
        this.totalpeople = totalpeople;
    }

    public int getTotalpeople() {
        return totalpeople;
    }

    public void setTotalmale(int totalmale) {
        this.totalmale = totalmale;
    }

    public int getTotalmale() {
        return totalmale;
    }

    public void setTotalfemale(int totalfemale) {
        this.totalfemale = totalfemale;
    }

    public int getTotalfemale() {
        return totalfemale;
    }

    public void setPeopleliterate(int peopleliterate) {
        this.peopleliterate = peopleliterate;
    }

    public int getPeopleliterate() {
        return peopleliterate;
    }

    public void setMaleliterate(int maleliterate) {
        this.maleliterate = maleliterate;
    }

    public int getMaleliterate() {
        return maleliterate;
    }

    public void setFemaleliterate(int femaleliterate) {
        this.femaleliterate = femaleliterate;
    }

    public int getFemaleliterate() {
        return femaleliterate;
    }

    public void setPeopleilliterate(int peopleilliterate) {
        this.peopleilliterate = peopleilliterate;
    }

    public int getPeopleilliterate() {
        return peopleilliterate;
    }

    public void setMaleilliterate(int maleilliterate) {
        this.maleilliterate = maleilliterate;
    }

    public int getMaleilliterate() {
        return maleilliterate;
    }

    public void setFemaleilliterate(int femaleilliterate) {
        this.femaleilliterate = femaleilliterate;
    }

    public int getFemaleilliterate() {
        return femaleilliterate;
    }

    public void setTotalworkingpeople(int totalworkingpeople) {
        this.totalworkingpeople = totalworkingpeople;
    }

    public int getTotalworkingpeople() {
        return totalworkingpeople;
    }

    public void setTotalworkingmale(int totalworkingmale) {
        this.totalworkingmale = totalworkingmale;
    }

    public int getTotalworkingmale() {
        return totalworkingmale;
    }

    public void setTotalworkingfemale(int totalworkingfemale) {
        this.totalworkingfemale = totalworkingfemale;
    }

    public int getTotalworkingfemale() {
        return totalworkingfemale;
    }

    public void setNonworkingpeople(int nonworkingpeople) {
        this.nonworkingpeople = nonworkingpeople;
    }

    public int getNonworkingpeople() {
        return nonworkingpeople;
    }

    public void setNonworkingmale(int nonworkingmale) {
        this.nonworkingmale = nonworkingmale;
    }

    public int getNonworkingmale() {
        return nonworkingmale;
    }

    public void setNonworkingfemale(int nonworkingfemale) {
        this.nonworkingfemale = nonworkingfemale;
    }

    public int getNonworkingfemale() {
        return nonworkingfemale;
    }
}