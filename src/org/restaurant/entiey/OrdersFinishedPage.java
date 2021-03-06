package org.restaurant.entiey;

import java.util.List;

public class OrdersFinishedPage {
    private List<OrdersFinished> ordersFinisheds;
    private int currentPage;
    private int pageSize;
    private int totalCount;
    private int totalPage;

    public OrdersFinishedPage(){

    }

    public OrdersFinishedPage(List<OrdersFinished> ordersFinisheds, int currentPage, int pageSize, int totalCount, int totalPage) {
        this.ordersFinisheds = ordersFinisheds;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
    }

    public List<OrdersFinished> getOrdersFinisheds() {
        return ordersFinisheds;
    }

    public void setOrdersFinisheds(List<OrdersFinished> ordersFinisheds) {
        this.ordersFinisheds = ordersFinisheds;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        this.totalPage = this.totalCount % this.pageSize == 0? this.totalCount/this.pageSize : (this.totalCount/this.pageSize)+1;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

}
