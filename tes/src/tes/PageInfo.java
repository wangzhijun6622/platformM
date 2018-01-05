package tes;

import java.util.List;

public class PageInfo {
	private List list;// Ҫ���ص�ĳһҳ�ļ�¼�б�
	 private int allRow;// �ܼ�¼��
	 private int totalPage;// ��ҳ��
	 private int currentPage;// ��ǰҳ
	 private int pageSize;// ÿҳ��¼��
	 private boolean isFirstPage;// �Ƿ�Ϊ��һҳ
	 private boolean isLastPage;// �Ƿ�Ϊ���һҳ
	 private boolean hasPreviousPage;// �Ƿ���ǰһҳ
	 private boolean hasNextPage;// �Ƿ�����һҳ
	 private Integer pageno;
	 
	 private Integer lastpageno;

	 public List getList() {
	  return list;
	 }

	 public void setList(List list) {
	  this.list = list;
	 }

	 public int getAllRow() {
	  return allRow;
	 }

	 public void setAllRow(int allRow) {
	  this.allRow = allRow;
	 }

	 public int getTotalPage() {
	  return totalPage;
	 }

	 public void setTotalPage(int totalPage) {
	  this.totalPage = totalPage;
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
	 }

	 public Integer getPageno() {
		return pageno;
	}

	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}

	public Integer getLastpageno() {
		return lastpageno;
	}

	public void setLastpageno(Integer lastpageno) {
		this.lastpageno = lastpageno;
	}

	/**
	  * �����ж�ҳ����Ϣ��ֻ��Ҫgetter������is����������
	  */
	 public boolean isFirstPage() {
	  return currentPage == 1;// ���ǵ�ǰҳ�ǵ�һҳ
	 }

	 public boolean isLastPage() {
	  return currentPage == totalPage;// �����ǰҳ�����һҳ
	 }

	 public boolean isHasPreviousPage() {
	  return currentPage != 1;// ֻҪ��ǰҳ���ǵ�һҳ
	 }

	 public boolean isHasNextPage() {
	  return currentPage != totalPage;// ֻҪ��ǰ�������һҳ
	 }

	 /**
	  * ��ʼ����ҳ��Ϣ
	  */
	 public void init() {
	  this.isFirstPage = isFirstPage();
	  this.isLastPage = isLastPage();
	  this.hasPreviousPage = isHasPreviousPage();
	  this.hasNextPage = isHasNextPage();
	 }

	 /***************************************************************************
	  * 
	  * ������ҳ������̬���������ⲿֱ��ͨ���������� pageSize ÿҳ��¼�� allRow �ܼ�¼��
	  * 
	  * @return ��ҳ��
	  */
	 public static int counTotalPage(final int pageSize, final int allRow) {
	  int totalPage = allRow % pageSize == 0 ? allRow / pageSize : allRow
	    / pageSize + 1;
	  return totalPage;
	 }

	 /***************************************************************************
	  * 
	  * ���㵱ǰҳ��ʼ��¼ pageSize ÿҳ��¼�� currentPage ��ǰ�ڼ�ҳ
	  * 
	  * @return ��ǰҳ��ʼ��¼��
	  */
	 public static int countOffset(final int pageSize, final int currentPage) {
	  final int offset = pageSize * (currentPage - 1);
	  return offset;
	 }

	 /***************************************************************************
	  * 
	  * ���㵱ǰҳ����Ϊ0���������URl��û��"?page=",����1���� page����Ĳ���������Ϊ�գ������򷵻�1��
	  * 
	  * @return ��ǰҳ
	  */
	 public static int countCurrentPage(int page) {
	  final int curPage = (page == 0 ? 1 : page);
	  return curPage;
	 }
	 
	 
	 public static int contpageno(int page) {
		  final int curPage =page/5;
		  return curPage;
		 }
}
