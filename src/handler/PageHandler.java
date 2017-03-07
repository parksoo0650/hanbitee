package handler;

import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.util.collections.SynchronizedStack;

import util.Pagination;

public class PageHandler implements Orderable {
    Map<?, ?> map;

    public PageHandler() {
	map = new HashMap<>();
    }

    public Integer[] getAttribute(){
	 Pagination page=new Pagination();
	 String pageNo=(String)map.get("pageNo");
	 String count=(String) map.get("count");
	 System.out.println("count : " + Integer.parseInt(count));
		System.out.println("pageCount"+page.getPageCount());
		page.setBlockSize(5);
		page.setRowCount(5);
		page.setCount(Integer.parseInt(count));
		page.setPageNo(pageNo);
		page.setPageStart();
		page.setPageEnd();
		page.setPageCount();
		page.setBlockCount();
		page.setBlockStart();
		page.setPrevBlock();
		page.setNextBlock();
		page.setBlockEnd();
   	return page.getAttribute();
       }

    @Override
    public void process(Map<?, ?> map) {
	this.map=map;
	
    }

}
