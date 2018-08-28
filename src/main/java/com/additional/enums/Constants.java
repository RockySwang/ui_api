/**
 * @author swang1
 *
 */
package com.additional.enums;

public class Constants{
	
	public enum Department { RISK, COMPLIA, CREDIT, CRM, GOPS, GRS, SRM };

	//request status   1-'opened',2-'approved',3-'cancelled'
	public static final int openedInt = 1;
	public static final String opened = "OPEN";

	public static final int approvedInt = 2;
	public static final String approved = "APPROVED";
	//public static final int cancelledInt = 3;
	
	public static final int deniedInt = 3;
	public static final String denied = "DENIED";

	public static final int runningInt = 5;
	public static final String running = "RUNNING";

	public static final int stoppedInt = 6;
	public static final String stopped = "STOPPED";

	public static final String START_TIME = "startTime";
	
	public static final String DEPARTMENT = "department";
	
	public static final String SELECT_VALUE = "selectValue";
	
	public static final String JOB_NAME = "jobName";
	
}