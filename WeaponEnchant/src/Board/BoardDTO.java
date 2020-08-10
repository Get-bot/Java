package Board;

// import java.sql.Date;

public class BoardDTO {
	private int bnumber;
	private String bwriter;
	private String bsubject;
	private String bcontents;
	private String bdate;
	private int bhits;

	BoardDTO() {
	}

	@Override
	public String toString() {
		return "BoardDTO [bnumber=" + bnumber + ", bwriter=" + bwriter + ", bsubject=" + bsubject + ", bcontents="
				+ bcontents + ", bdate=" + bdate + ", bhits=" + bhits + "]";
	}

	public int getBnumber() {
		return bnumber;
	}

	public String getBwriter() {
		return bwriter;
	}

	public String getBsubject() {
		return bsubject;
	}

	public String getBcontents() {
		return bcontents;
	}

	public String getBdate() {
		return bdate;
	}

	public int getBhits() {
		return bhits;
	}

	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public void setBsubject(String bsubject) {
		this.bsubject = bsubject;
	}

	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public void setBhits(int bhits) {
		this.bhits = bhits;
	}

	public BoardDTO(int bnumber, String bwriter, String bsubject, String bcontents, String bdate, int bhits) {
		super();
		this.bnumber = bnumber;
		this.bwriter = bwriter;
		this.bsubject = bsubject;
		this.bcontents = bcontents;
		this.bdate = bdate;
		this.bhits = bhits;
	}

}