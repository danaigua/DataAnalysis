package com.hengyue.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 学生实体类
 * @author 章家宝
 *
 */
@Entity
@Table(name = "t_student")
public class Student {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length = 50)
	private String ksh;
	
	@Column(length = 50)
	private String xm;
	
	@Column(length = 50)
	private String ksdm;
	
	@Column(length = 50)
	private String xbh;
	
	@Column(length = 50)
	private String xbmc;
	
	@Column(length = 50)
	private String sfzh;
	
	@Column(length = 50)
	private String lqkmh;
	
	@Column(length = 50)
	private String lqkm;
	
	@Column(length = 50)
	private String lqkmzf;
	
	@Column(length = 50)
	private String pw;
	
	@Column(length = 50)
	private String tdskfkmh;
	
	@Column(length = 50)
	private String skmc;
	
	@Column(length = 50)
	private String tdskf;
	
	@Column(length = 50)
	private String tdjf;
	
	@Column(length = 50)
	private String zgtzlist;
	
	@Column(length = 50)
	private String yxzth;
	
	@Column(length = 50)
	private String zymc;
	
	@Column(length = 50)
	private String hkh;
	
	@Column(length = 50)
	private String xqmc;
	
	@Column(length = 50)
	private String ksklh;
	
	@Column(length = 50)
	private String klmc;
	
	@Column(length = 50)
	private String csrqd;
	
	@Column(length = 50)
	private String byzxh;
	
	@Column(length = 50)
	private String zxmc;
	
	@Column(length = 50)
	private String byzxmc;
	
	@Column(length = 50)
	private String gddh;
	
	@Column(length = 50)
	private String yddh;
	
	@Column(length = 50)
	private String lxr;
	
	@Column(length = 50)
	private String tzbm;
	
	@Column(length = 50)
	private String sjr;
	
	@Column(length = 50)
	private String yjdz;
	
	@Column(length = 50)
	private String kslbh;
	
	@Column(length = 50)
	private String lbmc;
	
	@Column(length = 50)
	private String bylbh;
	
	@Column(length = 50)
	private String bylbmc;
	
	@Column(length = 50)
	private String mzh;
	
	@Column(length = 50)
	private String mzmc;
	
	@Column(length = 50)
	private String zzmmh;
	
	@Column(length = 50)
	private String zmmc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKsh() {
		return ksh;
	}

	public void setKsh(String ksh) {
		this.ksh = ksh;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getKsdm() {
		return ksdm;
	}

	public void setKsdm(String ksdm) {
		this.ksdm = ksdm;
	}

	public String getXbh() {
		return xbh;
	}

	public void setXbh(String xbh) {
		this.xbh = xbh;
	}

	public String getXbmc() {
		return xbmc;
	}

	public void setXbmc(String xbmc) {
		this.xbmc = xbmc;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public String getLqkmh() {
		return lqkmh;
	}

	public void setLqkmh(String lqkmh) {
		this.lqkmh = lqkmh;
	}

	public String getLqkm() {
		return lqkm;
	}

	public void setLqkm(String lqkm) {
		this.lqkm = lqkm;
	}

	public String getLqkmzf() {
		return lqkmzf;
	}

	public void setLqkmzf(String lqkmzf) {
		this.lqkmzf = lqkmzf;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTdskfkmh() {
		return tdskfkmh;
	}

	public void setTdskfkmh(String tdskfkmh) {
		this.tdskfkmh = tdskfkmh;
	}

	public String getSkmc() {
		return skmc;
	}

	public void setSkmc(String skmc) {
		this.skmc = skmc;
	}

	public String getTdskf() {
		return tdskf;
	}

	public void setTdskf(String tdskf) {
		this.tdskf = tdskf;
	}

	public String getTdjf() {
		return tdjf;
	}

	public void setTdjf(String tdjf) {
		this.tdjf = tdjf;
	}

	public String getZgtzlist() {
		return zgtzlist;
	}

	public void setZgtzlist(String zgtzlist) {
		this.zgtzlist = zgtzlist;
	}

	public String getYxzth() {
		return yxzth;
	}

	public void setYxzth(String yxzth) {
		this.yxzth = yxzth;
	}

	public String getZymc() {
		return zymc;
	}

	public void setZymc(String zymc) {
		this.zymc = zymc;
	}

	public String getHkh() {
		return hkh;
	}

	public void setHkh(String hkh) {
		this.hkh = hkh;
	}

	public String getXqmc() {
		return xqmc;
	}

	public void setXqmc(String xqmc) {
		this.xqmc = xqmc;
	}

	public String getKsklh() {
		return ksklh;
	}

	public void setKsklh(String ksklh) {
		this.ksklh = ksklh;
	}

	public String getKlmc() {
		return klmc;
	}

	public void setKlmc(String klmc) {
		this.klmc = klmc;
	}

	public String getCsrqd() {
		return csrqd;
	}

	public void setCsrqd(String csrqd) {
		this.csrqd = csrqd;
	}

	public String getByzxh() {
		return byzxh;
	}

	public void setByzxh(String byzxh) {
		this.byzxh = byzxh;
	}

	public String getZxmc() {
		return zxmc;
	}

	public void setZxmc(String zxmc) {
		this.zxmc = zxmc;
	}

	public String getByzxmc() {
		return byzxmc;
	}

	public void setByzxmc(String byzxmc) {
		this.byzxmc = byzxmc;
	}

	public String getGddh() {
		return gddh;
	}

	public void setGddh(String gddh) {
		this.gddh = gddh;
	}

	public String getYddh() {
		return yddh;
	}

	public void setYddh(String yddh) {
		this.yddh = yddh;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getTzbm() {
		return tzbm;
	}

	public void setTzbm(String tzbm) {
		this.tzbm = tzbm;
	}

	public String getSjr() {
		return sjr;
	}

	public void setSjr(String sjr) {
		this.sjr = sjr;
	}

	public String getYjdz() {
		return yjdz;
	}

	public void setYjdz(String yjdz) {
		this.yjdz = yjdz;
	}

	public String getKslbh() {
		return kslbh;
	}

	public void setKslbh(String kslbh) {
		this.kslbh = kslbh;
	}

	public String getLbmc() {
		return lbmc;
	}

	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}

	public String getBylbh() {
		return bylbh;
	}

	public void setBylbh(String bylbh) {
		this.bylbh = bylbh;
	}

	public String getBylbmc() {
		return bylbmc;
	}

	public void setBylbmc(String bylbmc) {
		this.bylbmc = bylbmc;
	}

	public String getMzh() {
		return mzh;
	}

	public void setMzh(String mzh) {
		this.mzh = mzh;
	}

	public String getMzmc() {
		return mzmc;
	}

	public void setMzmc(String mzmc) {
		this.mzmc = mzmc;
	}

	public String getZzmmh() {
		return zzmmh;
	}

	public void setZzmmh(String zzmmh) {
		this.zzmmh = zzmmh;
	}

	public String getZmmc() {
		return zmmc;
	}

	public void setZmmc(String zmmc) {
		this.zmmc = zmmc;
	}
	
	
}
