package com.exercise.slingmodels;

import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.venetian.cms.util.PathResolver;

/**
 * The Class SuperGalleryModel.
 */
@Model(adaptables = Resource.class)
public class HolidaysModel {

    private String[] holidays = {
            "New Year's Day - January 1",
            "Chinese New Year - January 25",
            "Bataan Day - April 9",
            "Maundy Thursday - April 9",
            "Good Friday - April 10",
            "Labor Day - May 1",
            "Independence Day - June 12",
            "National Heroes' Day - August 31",
            "All Saints' Day - November 1"
            "Bonifacio Day - November 30",
            "Christmas Day - December 25",
            "Rizal Day - Decmber 30",
            "New Year's Eve - December 31"
    };


    public String getHolidays() {

        return this.holidays;
    }
}
