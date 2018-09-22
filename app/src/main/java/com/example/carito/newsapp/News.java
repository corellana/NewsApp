package com.example.carito.newsapp;

import java.text.SimpleDateFormat;

/**
 * {@link News} represents a News that the user wants to read.
 * It contains title, name of the section, author name, date published and URL of the news.
 */

public class News {

    /**
     * title for the news
     */
    private String mTitle;

    /**
     * Section of the news
     */
    private String mSection;

    /**
     * URL for the news
     */
    private String mUrl;

    /** Time of the news date published in milliseconds*/
    private long mTimeInMilliseconds;

    /**
     * CONSTRUCTOR
     * Create a new News object.
     *
     * @param title   is the  title for the news.
     * @param section is the specific section/category of the news.
     * @param timeInMilliseconds    is the day the article was published.
     * @param url     is the specific url for that article.
     */
    public News(String title, String section, long timeInMilliseconds, String url) {
        mTitle = title;
        mSection = section;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /** METHODS */

    /**
     * Get the title  of the news
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the section  of the news
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Get URL of the news
     */
    public String getUrl() {
        return mUrl;
    }

    /** Get the date of the news in milliseconds */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}
