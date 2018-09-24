package com.example.carito.newsapp;

/**
 * {@link News} represents a News that the user wants to read.
 * It contains title, name of the section, date published and the user can access to the specific url.
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

    /**
     * Time of the news date published in milliseconds
     */
    private long mTime;

    /**
     * CONSTRUCTOR
     * Create a new News object.
     *
     * @param title              is the  title for the news.
     * @param section            is the specific section/category of the news.
     * @param time               is the day the article was published.
     * @param url                is the specific url for that article.
     */
    public News(String title, String section, long time, String url) {
        mTitle = title;
        mSection = section;
        mTime = time;
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

    /**
     * Get the date of the news
     */
    public long getTime() {
        return mTime;
    }

}
