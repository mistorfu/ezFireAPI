package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author luping
 * @date 2018/5/28 14:57
 */
@ApiModel(value = "突出灾情",description = "突出灾情对象")
public class InnerTczq {
    @ApiModelProperty(value = "部局",name = "level_0",example = "0")
    private String level_0;
    @ApiModelProperty(value = "总队",name = "level_1",example = "1")
    private String level_1;
    @ApiModelProperty(value = "支队",name = "level_2",example = "1")
    private String level_2;
    @ApiModelProperty(value = "大队",name = "level_3",example = "1")
    private String level_3;
    @ApiModelProperty(value = "中队",name = "level_4",example = "1")
    private String level_4;

    public String getLevel_0() {
        return level_0;
    }

    public void setLevel_0(String level_0) {
        this.level_0 = level_0;
    }

    public String getLevel_1() {
        return level_1;
    }

    public void setLevel_1(String level_1) {
        this.level_1 = level_1;
    }

    public String getLevel_2() {
        return level_2;
    }

    public void setLevel_2(String level_2) {
        this.level_2 = level_2;
    }

    public String getLevel_3() {
        return level_3;
    }

    public void setLevel_3(String level_3) {
        this.level_3 = level_3;
    }

    public String getLevel_4() {
        return level_4;
    }

    public void setLevel_4(String level_4) {
        this.level_4 = level_4;
    }
}
