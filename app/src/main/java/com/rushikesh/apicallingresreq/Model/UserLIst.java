package com.rushikesh.apicallingresreq.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class UserLIst {

    @SerializedName("page")
    private Integer page;

    @SerializedName("per_page")
    private Integer perPage;

    @SerializedName("total")
    private Integer total;

    @SerializedName("total_pages")
    private Integer totalPages;

    @SerializedName("data")
    private ArrayList<Data> data = null;

    @SerializedName("support")
    private Support support;

    public UserLIst() {
    }

    public UserLIst(Integer page, Integer perPage, Integer total, Integer totalPages,
                    ArrayList<Data> data, Support support) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
        this.support = support;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}
