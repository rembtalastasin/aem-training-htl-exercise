package com.codeandtheory.exercises.slingmodels.core.models.impl;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import com.codeandtheory.exercises.slingmodels.core.models.HolidaysModel;

@Model(adaptables = Resource.class, adapters = HolidaysModel.class)
public final class HolidaysModelImpl implements HolidaysModel {

    private String[] holidays = {
            "New Year's Day - January 1",
            "Chinese New Year - January 25",
            "Bataan Day - April 9",
            "Maundy Thursday - April 9",
            "Good Friday - April 10",
            "Labor Day - May 1",
            "Independence Day - June 12",
            "National Heroes' Day - August 31",
            "All Saints' Day - November 1",
            "Bonifacio Day - November 30",
            "Christmas Day - December 25",
            "Rizal Day - Decmber 30",
            "New Year's Eve - December 31"
    };

    private String sample = "Hello!";


    public String[] getHolidays() {

        return this.holidays;
    }

    public String getSample() {
        return this.sample;
    }
}
