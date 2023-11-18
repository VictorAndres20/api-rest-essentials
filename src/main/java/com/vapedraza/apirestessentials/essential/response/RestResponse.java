package com.vapedraza.apirestessentials.essential.response;

import java.util.List;

public class RestResponse<M> {

    private boolean ok;

    private M data;
    private List<M> list;
    private String error;

    public RestResponse(){
        this.ok = true;
    }

    public RestResponse<M> buildError(String error){
        this.ok = false;
        this.error = error;
        return this;
    }

    public RestResponse<M> buildData(M data){
        this.data = data;
        return this;
    }

    public RestResponse<M> buildList(List<M> data){
        this.list = data;
        return this;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public M getData() {
        return data;
    }

    public void setData(M data) {
        this.data = data;
    }

    public List<M> getList() {
        return list;
    }

    public void setList(List<M> list) {
        this.list = list;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
