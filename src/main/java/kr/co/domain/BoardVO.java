package kr.co.domain;

import java.io.Serializable;
import java.util.Objects;

public class BoardVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bno;
	private String title;
	private String content;
	private String id;
	private String regdate;
	private String updatedate;
	private int viewcnt;
	private int con;
	private String[] insertfiles;
	private String[] deletefiles;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public BoardVO(String title, String content, String id) {
		super();
		this.title = title;
		this.content = content;
		this.id = id;
	}
	
	public BoardVO(int bno, String title, String content, String id, String regdate, String updatedate, int viewcnt,
			int con) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.id = id;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.viewcnt = viewcnt;
		this.con = con;
	}

	public BoardVO(int bno, String title, String content, String id, String regdate, String updatedate, int viewcnt,
			int con, String[] insertfiles, String[] deletefiles) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.id = id;
		this.regdate = regdate;
		this.updatedate = updatedate;
		this.viewcnt = viewcnt;
		this.con = con;
		this.insertfiles = insertfiles;
		this.deletefiles = deletefiles;
	}

	public String[] getInsertfiles() {
		return insertfiles;
	}

	public void setInsertfiles(String[] insertfiles) {
		this.insertfiles = insertfiles;
	}

	public String[] getDeletefiles() {
		return deletefiles;
	}

	public void setDeletefiles(String[] deletefiles) {
		this.deletefiles = deletefiles;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public int getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", id=" + id + ", updatedate=" + updatedate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardVO other = (BoardVO) obj;
		return bno == other.bno;
	}

}
