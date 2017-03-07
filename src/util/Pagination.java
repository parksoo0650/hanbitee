package util;

import lombok.Data;
import lombok.Getter;

@Data
public class Pagination {
    @Getter 
    private int rowCount,pageNo,pageStart,pageEnd,count,pageCount,
    blockSize,blockCount,blockStart,prevBlock,nextBlock,blockEnd;
    
    
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }


    public void setPageNo(String pageNo) {
        this.pageNo = Integer.parseInt(pageNo);
    }


    public void setPageStart() {
        this.pageStart = (pageNo-1)*rowCount+1;
    }


    public void setPageEnd() {
        this.pageEnd = pageNo*rowCount;
    }


    public void setCount(int count) {
        this.count = count;
    }


    public void setPageCount() {
	this.pageCount=(count%rowCount==0)?count/rowCount:count/rowCount+1;
	System.out.println("pageCount : " + this.pageCount);
    }


    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }


    public void setBlockCount() {
        this.blockCount = pageCount/blockSize;
    }


    public void setBlockStart() {
        this.blockStart = pageNo-((pageNo-1)%blockSize);
    }


    public void setPrevBlock() {
        this.prevBlock = blockStart-blockSize;
    }


    public void setNextBlock() {
        this.nextBlock = blockStart+blockSize;
    }


    public void setBlockEnd() {
	this.blockEnd=blockCount;
	this.blockEnd=((blockStart+rowCount-1)<pageCount)?blockStart+blockSize-1:pageCount;
	
    }


    public Integer[] getAttribute(){
	Integer[] arr={count,pageCount,pageNo,pageStart,pageEnd,
			blockStart,blockEnd,prevBlock,nextBlock};
	return arr;
    }
}
