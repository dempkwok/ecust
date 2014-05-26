package demp.soft.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import demp.soft.DB.*;
import demp.soft.Model.*;

public class PatentDAO {
	private Connection con;

	public PatentDAO() {
		con = new GetDPConnection().getCon();
	}

	/**
	 * @param Pid
	 * **/
	public void getPatentInfoAll() {
	}

	/**
	 * 返回PatentInfos List
	 * 
	 * @param info
	 *            查找对象
	 * @return
	 * */
	public void SearchPatent() {
	}

	/**
	 * 返回PatentInfos List
	 * 
	 * @param info
	 *            查找对象
	 * @return 只返回PId
	 * */
	public void Search() {
	}

	/**
	 * 获取图片 FileName@l@PId 可以 输出到文件 以供Hadoop使用
	 * 
	 * @return
	 * */
	public void getPatentViewInfo() {

	}

	/**
	 * 获取 PId,FingerPrint
	 * 
	 * @return
	 * */
	public void getPatentFingerPrint() {
	}

	/**
	 * 直插入patent信息 不包括图片
	 * 
	 * @param patent
	 *            插入的patent
	 * @return
	 * */
	public void InsertPatent( ) {
	}

	/**
	 * 插入信息与图片
	 * 
	 * @param patent
	 *            插入的信息
	 * */
	public void InsertPatentInfoAndView( ) {

	}

	/**
	 * 增加图片
	 * 
	 * @param view
	 *            插入的图片特征值
	 * */
	public void InsertPatentView () {

	}

	public void UpdatePatentView() {

	}

	public void SearchView() {
	}
}
