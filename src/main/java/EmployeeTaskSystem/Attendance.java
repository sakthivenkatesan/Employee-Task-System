package EmployeeTaskSystem;

import java.util.Date;
import java.util.List;

public class Attendance 
{
	private int attendance_id;
	private Date attendance_date = new Date();
	private Attendance_Types status;
	public int getAttendance_id() {
		return attendance_id;
	}
	public void setAttendance_id(int attendance_id) {
		this.attendance_id = attendance_id;
	}
	public Date getAttendance_date() {
		return attendance_date;
	}
	public void setAttendance_date(Date attendance_date) {
		this.attendance_date = attendance_date;
	}
	public Attendance_Types getStatus() {
		return status;
	}
	public void setStatus(Attendance_Types status) {
		this.status = status;
	}
	public Attendance() {
		super();
	}
	public List<Attendance> getAttendance_list() {
		// TODO Auto-generated method stub
		return null;
	}
}
