package cfg.hibernate;

// Generated 2015-6-16 1:29:29 by Hibernate Tools 4.0.0

/**
 * Beanreadertype generated by hbm2java
 */
public class Beanreadertype implements java.io.Serializable {

	private Integer readerTypeId;
	private String readerTypeName;
	private int lendBookLimitted;

	public Beanreadertype() {
	}

	public Beanreadertype(String readerTypeName, int lendBookLimitted) {
		this.readerTypeName = readerTypeName;
		this.lendBookLimitted = lendBookLimitted;
	}

	public Integer getReaderTypeId() {
		return this.readerTypeId;
	}

	public void setReaderTypeId(Integer readerTypeId) {
		this.readerTypeId = readerTypeId;
	}

	public String getReaderTypeName() {
		return this.readerTypeName;
	}

	public void setReaderTypeName(String readerTypeName) {
		this.readerTypeName = readerTypeName;
	}

	public int getLendBookLimitted() {
		return this.lendBookLimitted;
	}

	public void setLendBookLimitted(int lendBookLimitted) {
		this.lendBookLimitted = lendBookLimitted;
	}

}
