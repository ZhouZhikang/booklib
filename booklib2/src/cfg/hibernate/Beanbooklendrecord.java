package cfg.hibernate;

// Generated 2015-6-16 1:29:29 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Beanbooklendrecord generated by hbm2java
 */
public class Beanbooklendrecord implements java.io.Serializable {

	private Integer id;
	private Beansystemuser beansystemuserByReturnOperUserid;
	private Beanreader beanreader;
	private Beansystemuser beansystemuserByLendOperUserid;
	private Beanbook beanbook;
	private Date lendDate;
	private Date returnDate;
	private Double penalSum;

	public Beanbooklendrecord() {
	}

	public Beanbooklendrecord(Beanreader beanreader,
			Beansystemuser beansystemuserByLendOperUserid, Beanbook beanbook,
			Date lendDate) {
		this.beanreader = beanreader;
		this.beansystemuserByLendOperUserid = beansystemuserByLendOperUserid;
		this.beanbook = beanbook;
		this.lendDate = lendDate;
	}

	public Beanbooklendrecord(Beansystemuser beansystemuserByReturnOperUserid,
			Beanreader beanreader,
			Beansystemuser beansystemuserByLendOperUserid, Beanbook beanbook,
			Date lendDate, Date returnDate, Double penalSum) {
		this.beansystemuserByReturnOperUserid = beansystemuserByReturnOperUserid;
		this.beanreader = beanreader;
		this.beansystemuserByLendOperUserid = beansystemuserByLendOperUserid;
		this.beanbook = beanbook;
		this.lendDate = lendDate;
		this.returnDate = returnDate;
		this.penalSum = penalSum;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Beansystemuser getBeansystemuserByReturnOperUserid() {
		return this.beansystemuserByReturnOperUserid;
	}

	public void setBeansystemuserByReturnOperUserid(
			Beansystemuser beansystemuserByReturnOperUserid) {
		this.beansystemuserByReturnOperUserid = beansystemuserByReturnOperUserid;
	}

	public Beanreader getBeanreader() {
		return this.beanreader;
	}

	public void setBeanreader(Beanreader beanreader) {
		this.beanreader = beanreader;
	}

	public Beansystemuser getBeansystemuserByLendOperUserid() {
		return this.beansystemuserByLendOperUserid;
	}

	public void setBeansystemuserByLendOperUserid(
			Beansystemuser beansystemuserByLendOperUserid) {
		this.beansystemuserByLendOperUserid = beansystemuserByLendOperUserid;
	}

	public Beanbook getBeanbook() {
		return this.beanbook;
	}

	public void setBeanbook(Beanbook beanbook) {
		this.beanbook = beanbook;
	}

	public Date getLendDate() {
		return this.lendDate;
	}

	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Double getPenalSum() {
		return this.penalSum;
	}

	public void setPenalSum(Double penalSum) {
		this.penalSum = penalSum;
	}

}
