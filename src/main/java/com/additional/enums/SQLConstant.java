/**
 * @author swang1
 *
 */
package com.additional.enums;

import java.sql.Timestamp;

public final class SQLConstant{
	
	public static final String getJobExecutions =
		      "SELECT * FROM gobblin.ui_application";
	
	public static final String getAppMappingJobs =
		      "SELECT * FROM gobblin.gobblin_job_executions where job_name = #{id}";
	
	public static final String getAll =
		    "SELECT * FROM gobblin.ui_application";
	
	public static final String getJobsAmount =
			"SELECT count(*) FROM gobblin_job_executions;";
	
	public static final String getPendJobsAmount =
			"SELECT count(*) FROM gobblin_job_executions where state='PENDING';";
	
	public static final String getRunJobsAmount =
			"SELECT count(*) FROM gobblin_job_executions where state='RUNNING';";
	
	public static final String getCancelJobsAmount =
			"SELECT count(*) FROM gobblin_job_executions where state='CANCELLED';";
	
	public static final String getCommitJobsAmount =
			"SELECT count(*) FROM gobblin_job_executions where state='COMMITTED';";
	
	public static final String getSuccJobsAmount =
			"SELECT count(*) FROM gobblin_job_executions where state='SUCCESSFUL';";
	
	public static final String getFailedJobsAmount =
			"SELECT count(*) FROM gobblin_job_executions where state='FAILED';";
	
	public static final String getSkipJobsAmount =
			"SELECT count(*) FROM gobblin_job_executions where state='SKIPPED';";
	
	public static final String getJobsName =
			"SELECT gobblin_job_executions.job_name,gobblin_job_executions.end_time " +
					"FROM gobblin_job_executions where state='FAILED';";
	
	public static final String getJobsAmountOnehr =
			"SELECT count(*) FROM gobblin_job_executions where start_time>=date_sub(now(),interval 1 hour);";
	
	public static final String getPendJobsAmountOnehr =
			"SELECT count(*) FROM gobblin_job_executions where state='PENDING' " +
					"and start_time>=date_sub(now(),interval 1 hour);";
			
	public static final String getRunJobsAmountOnehr =
			"SELECT count(*) FROM gobblin_job_executions where state='RUNNING' " +
					"and start_time>=date_sub(now(),interval 1 hour);";
	
	public static final String getCancelJobsAmountOnehr =
			"SELECT count(*) FROM gobblin_job_executions where state='CANCELLED' " +
					"and start_time>=date_sub(now(),interval 1 hour);";
	
	public static final String getCommitJobsAmountOnehr =
			"SELECT count(*) FROM gobblin_job_executions where state='COMMITTED' " +
					"and start_time>=date_sub(now(),interval 1 hour);";
	
	public static final String getSuccJobsAmountOnehr =
			"SELECT count(*) FROM gobblin_job_executions where state='SUCCESSFUL' " +
					"and start_time>=date_sub(now(),interval 1 hour);";
	
	public static final String getFailedJobsAmountOnehr =
			"SELECT count(*) FROM gobblin_job_executions where state='FAILED' " +
					"and start_time>=date_sub(now(),interval 1 hour);";
	
	public static final String getSkipJobsAmountOnehr =
			"SELECT count(*) FROM gobblin_job_executions where state='SKIPPED' " +
					"and start_time>=date_sub(now(),interval 1 hour);";
	
	public static final String getJobsNameOnehr =
			"SELECT gobblin_job_executions.job_name,gobblin_job_executions.end_time " +
					"FROM gobblin_job_executions where state='FAILED' " +
                    "and start_time>=date_sub(now(),interval 1 hour);";
	
	public static final String getJobsAmountHrs =
			"SELECT count(*) FROM gobblin_job_executions where start_time>=date_sub(now(),interval 12 hour);";
	
	public static final String getPendJobsAmountHrs =
			"SELECT count(*) FROM gobblin_job_executions where state='PENDING' " +
					"and start_time>=date_sub(now(),interval 12 hour);";
	
	public static final String getRunJobsAmountHrs =
			"SELECT count(*) FROM gobblin_job_executions where state='RUNNING' " +
					"and start_time>=date_sub(now(),interval 12 hour);";
	
	public static final String getCancelJobsAmountHrs =
			"SELECT count(*) FROM gobblin_job_executions where state='CANCELLED' " +
					"and start_time>=date_sub(now(),interval 12 hour);";
	
	public static final String getCommitJobsAmountHrs =
			"SELECT count(*) FROM gobblin_job_executions where state='COMMITTED' " +
                    "and start_time>=date_sub(now(),interval 12 hour);";
	
	public static final String getSuccJobsAmountHrs =
			"SELECT count(*) FROM gobblin_job_executions where state='SUCCESSFUL' " +
					"and start_time>=date_sub(now(),interval 12 hour);";
			
	public static final String getFailedJobsAmountHrs =
			"SELECT count(*) FROM gobblin_job_executions where state='FAILED' " +
					"and start_time>=date_sub(now(),interval 12 hour);";
	
	public static final String getSkipJobsAmountHrs =
			"SELECT count(*) FROM gobblin_job_executions where state='SKIPPED' " +
					"and start_time>=date_sub(now(),interval 12 hour);";
	
	public static final String getJobsNameHrs =
			"SELECT gobblin_job_executions.job_name,gobblin_job_executions.end_time " +
					"FROM gobblin_job_executions where state='FAILED' " +
                    "and start_time>=date_sub(now(),interval 12 hour);";
	
	public static final String getJobsAmountDay =
			"SELECT count(*) FROM gobblin_job_executions where start_time>=date_sub(now(),interval 24 hour);";
	
	public static final String getPendJobsAmountDay =
			"SELECT count(*) FROM gobblin_job_executions where state='PENDING' " +
					"and start_time>=date_sub(now(),interval 24 hour);";
	
	public static final String getRunJobsAmountDay =
			"SELECT count(*) FROM gobblin_job_executions where state='RUNNING' " +
					"and start_time>=date_sub(now(),interval 24 hour);";
	
	public static final String getCancelJobsAmountDay =
			"SELECT count(*) FROM gobblin_job_executions where state='CANCELLED' " +
					"and start_time>=date_sub(now(),interval 24 hour);";
	
	public static final String getCommitJobsAmountDay =
			"SELECT count(*) FROM gobblin_job_executions where state='COMMITTED' " +
					"and start_time>=date_sub(now(),interval 24 hour);";
	
	public static final String getSuccJobsAmountDay =
			"SELECT count(*) FROM gobblin_job_executions where state='SUCCESSFUL' " +
                    "and start_time>=date_sub(now(),interval 24 hour);";
	
	public static final String getFailedJobsAmountDay =
			"SELECT count(*) FROM gobblin_job_executions where state='FAILED' " +
                    "and start_time>=date_sub(now(),interval 24 hour);";
	
	public static final String getSkipJobsAmountDay =
			"SELECT count(*) FROM gobblin_job_executions where state='SKIPPED' " +
                    "and start_time>=date_sub(now(),interval 24 hour);";
	
	public static final String getJobsNameDay =
			"SELECT gobblin_job_executions.job_name,gobblin_job_executions.end_time FROM gobblin_job_executions " +
					"where state='FAILED' and start_time>=date_sub(now(),interval 24 hour);";

	public static final String getJobsAmountGroupByEveryday = 
			"SELECT date_format(start_time,'%Y-%m-%d') as day,count(*) as count from gobblin_job_executions " +
					"where start_time>=${"+Constants.START_TIME+"} group by day;";

	public static final String getJobsAmountGroupByEverydayNotBO = 
			"SELECT date_format(a.start_time,'%Y-%m-%d') as day,count(*) as count from gobblin_job_executions as a " +
					"where a.job_name not in (SELECT b.job_name from gobblin_job_department as b " +
					"where b.department_name in ('COMPLIA','CREDIT','CRM','GOPS','GRS','SRM')) " +
					"and a.start_time>=${"+Constants.START_TIME+"} group by day;";
	
	public static final String getJobsFailAmountGroupByEveryday = 
			"SELECT date_format(start_time,'%Y-%m-%d') as day,count(*) as count from gobblin_job_executions where start_time>=${"+Constants.START_TIME+"} and state='FAILED' group by day;";
	
	public static final String getJobsFailAmountGroupByEverydayNotBO = 
			"SELECT date_format(a.start_time,'%Y-%m-%d') as day,count(*) as count " +
                    "from gobblin_job_executions as a where a.job_name not in (SELECT b.job_name from gobblin_job_department as b where b.department_name in ('COMPLIA','CREDIT','CRM','GOPS','GRS','SRM')) and a.start_time>=${"+Constants.START_TIME+"} and a.state='FAILED' group by day;";
	
	public static final String getBOJobsAmountGroupByEveryday = 
			"SELECT date_format(a.start_time,'%Y-%m-%d') as day,count(*) as count " +
                    "from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and b.department_name=#{"+Constants.DEPARTMENT+"} group by day;";
	
	public static final String getBOJobsFailAmountGroupByEveryday = 
			"SELECT date_format(a.start_time,'%Y-%m-%d') as day,count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and a.state='FAILED' and b.department_name=#{"+Constants.DEPARTMENT+"} group by day;";
	
	public static final String getJobsAmountOneHourByBO = 
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.start_time>=date_sub(now(),interval 1 hour) and b.department_name=#{"+Constants.SELECT_VALUE+"};";
	
	public static final String getPendJobsAmountOneHourByBO = 
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.state='PENDING' and a.start_time>=date_sub(now(),interval 1 hour) and b.department_name=#{"+Constants.SELECT_VALUE+"};";
	
	public static final String getRunJobsAmountOneHourByBO = 
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.state='RUNNING' and a.start_time>=date_sub(now(),interval 1 hour) and b.department_name=#{"+Constants.SELECT_VALUE+"};";
	
	public static final String getCancelJobsAmountOneHourByBO = 
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.state='CANCELLED' and a.start_time>=date_sub(now(),interval 1 hour) and b.department_name=#{"+Constants.SELECT_VALUE+"};";
	
	public static final String getSuccJobsAmountOneHourByBO = 
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.state='SUCCESSFUL' and a.start_time>=date_sub(now(),interval 1 hour) and b.department_name=#{"+Constants.SELECT_VALUE+"};";
	
	public static final String getFailedJobsAmountOneHourByBO = 
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.state='FAILED' and a.start_time>=date_sub(now(),interval 1 hour) and b.department_name=#{"+Constants.SELECT_VALUE+"};";
	
	public static final String getCommitJobsAmountOneHourByBO = 
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.state='COMMITTED' and a.start_time>=date_sub(now(),interval 1 hour) and b.department_name=#{"+Constants.SELECT_VALUE+"};";
	
	public static final String getSkipJobsAmountOneHourByBO = 
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b on a.job_name=b.job_name and a.state='SKIPPED' and a.start_time>=date_sub(now(),interval 1 hour) and b.department_name=#{"+Constants.SELECT_VALUE+"};";
	
	public static final String getJobsAmountOneHourByNullBO = 
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in (SELECT b.job_name from gobblin_job_department as b) and a.start_time>=date_sub(now(),interval 1 hour);";
	
	public static final String getPendJobsAmountOneHourByNullBO = 
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in (SELECT b.job_name from gobblin_job_department as b) and a.start_time>=date_sub(now(),interval 1 hour) and a.state='PENDING';";
	
	public static final String getRunJobsAmountOneHourByNullBO = 
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in (SELECT b.job_name from gobblin_job_department as b) and a.start_time>=date_sub(now(),interval 1 hour) and a.state='RUNNING';";
	
	public static final String getCancelJobsAmountOneHourByNullBO = 
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in (SELECT b.job_name from gobblin_job_department as b) and a.start_time>=date_sub(now(),interval 1 hour) and a.state='CANCELLED';";
	
	public static final String getSuccJobsAmountOneHourByNullBO = 
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in (SELECT b.job_name from gobblin_job_department as b) and a.start_time>=date_sub(now(),interval 1 hour) and a.state='SUCCESSFUL';";
	
	public static final String getFailedJobsAmountOneHourByNullBO = 
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in (SELECT b.job_name from gobblin_job_department as b) and a.start_time>=date_sub(now(),interval 1 hour) and a.state='FAILED';";
	
	public static final String getCommitJobsAmountOneHourByNullBO = 
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in (SELECT b.job_name from gobblin_job_department as b) and a.start_time>=date_sub(now(),interval 1 hour) and a.state='COMMITTED';";
	
	public static final String getSkipJobsAmountOneHourByNullBO = 
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in (SELECT b.job_name from gobblin_job_department as b) and a.start_time>=date_sub(now(),interval 1 hour) and a.state='SKIPPED';";
	
	public static final String getJobsAmountByTime = 
			"SELECT count(*) FROM gobblin_job_executions where start_time>=${"+Constants.START_TIME+"};";
	
	public static final String getPendJobsAmountByTime = 
			"SELECT count(*) FROM gobblin_job_executions where state='PENDING' and start_time>=${"+Constants.START_TIME+"};";
	
	public static final String getRunJobsAmountByTime = 
			"SELECT count(*) FROM gobblin_job_executions where state='RUNNING' and start_time>=${"+Constants.START_TIME+"};";
	
	public static final String getCancelJobsAmountByTime =
			"SELECT count(*) FROM gobblin_job_executions where state='CANCELLED' and start_time>=${"+Constants.START_TIME+"};";
	
	public static final String getSuccJobsAmountByTime =
			"SELECT count(*) FROM gobblin_job_executions where state='SUCCESSFUL' and start_time>=${"+Constants.START_TIME+"};";
	
	public static final String getFailedJobsAmountByTime =
			"SELECT count(*) FROM gobblin_job_executions where state='FAILED' and start_time>=${"+Constants.START_TIME+"};";
	
	public static final String getCommitJobsAmountByTime =
			"SELECT count(*) FROM gobblin_job_executions where state='COMMITTED' and start_time>=${"+Constants.START_TIME+"};";
	
	public static final String getSkipJobsAmountByTime =
			"SELECT count(*) FROM gobblin_job_executions where state='SKIPPED' and start_time>=${"+Constants.START_TIME+"};";
	
	public static final String getJobsAmountByUnknowBOAndTime =
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in " +
					"(SELECT b.job_name from gobblin_job_department as b) and a.start_time>=${"+Constants.START_TIME+"};";
	
	public static final String getPendJobsAmountByUnknowBOAndTime =
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in " +
					"(SELECT b.job_name from gobblin_job_department as b) and a.start_time>=${"+Constants.START_TIME+"} and " +
					"a.state='PENDING';";
	
	public static final String getRunJobsAmountByUnknowBOAndTime =
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in " +
					"(SELECT b.job_name from gobblin_job_department as b) and a.start_time>=${"+Constants.START_TIME+"} " +
					"and a.state='RUNNING';";
	
	public static final String getCancelJobsAmountByUnknowBOAndTime =
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in " +
					"(SELECT b.job_name from gobblin_job_department as b) and a.start_time>=${"+Constants.START_TIME+"} " +
					"and a.state='CANCELLED';";
	
	public static final String getSuccJobsAmountByUnknowBOAndTime =
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in " +
					"(SELECT b.job_name from gobblin_job_department as b) and a.start_time>=${"+Constants.START_TIME+"} and " +
					"a.state='SUCCESSFUL';";
	
	public static final String getFailedJobsAmountByUnknowBOAndTime =
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in " +
					"(SELECT b.job_name from gobblin_job_department as b) and a.start_time>=${"+Constants.START_TIME+"} and " +
					"a.state='FAILED';";
	
	public static final String getCommitJobsAmountByUnknowBOAndTime =
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in " +
					"(SELECT b.job_name from gobblin_job_department as b) and a.start_time>=${"+Constants.START_TIME+"} and " +
					"a.state='COMMITTED';";
	
	public static final String getSkipJobsAmountByUnknowBOAndTime =
			"SELECT count(*) FROM gobblin_job_executions as a where a.job_name not in " +
					"(SELECT b.job_name from gobblin_job_department as b) and a.start_time>=${"+Constants.START_TIME+"} and " +
					"a.state='SKIPPED';";
			
	public static final String getJobsAmountByBOAndTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and " +
					"b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getPendJobsAmountByBOAndTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and " +
					"a.state='PENDING' and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getRunJobsAmountByBOAndTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and a.state='RUNNING' " +
					"and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getCancelJobsAmountByBOAndTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and a.state='CANCELLED' " +
					"and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getSuccJobsAmountByBOAndTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and a.state='SUCCESSFUL' " +
					"and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getFailedJobsAmountByBOAndTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and a.state='FAILED' " +
					"and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getCommitJobsAmountByBOAndTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and a.state='COMMITTED' " +
					"and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getSkipJobsAmountByBOAndTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.start_time>=${"+Constants.START_TIME+"} and a.state='SKIPPED' " +
					"and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getJobsAmountDeptAndAllTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and b.department_name=#{"+Constants.DEPARTMENT+"};";
			
	public static final String getPendJobsAmountDeptAndAllTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.state='PENDING' and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getRunJobsAmountDeptAndAllTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.state='RUNNING' and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getCancelJobsAmountDeptAndAllTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.state='CANCELLED' and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getSuccJobsAmountDeptAndAllTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.state='SUCCESSFUL' and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getFailedJobsAmountDeptAndAllTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.state='FAILED' and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getCommitJobsAmountDeptAndAllTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.state='COMMITTED' and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String getSkipJobsAmountDeptAndAllTime =
			"SELECT count(*) as count from gobblin_job_executions as a inner join gobblin_job_department as b " +
					"on a.job_name=b.job_name and a.state='SKIPPED' and b.department_name=#{"+Constants.DEPARTMENT+"};";
	
	public static final String insertDepartment =
			"insert into gobblin_job_department(job_name,department_name)" +
                    "values(#{"+Constants.JOB_NAME+"},#{"+Constants.DEPARTMENT+"});";
	
	//JobRequestHortonMapper
	public static final String insertJobAppData =
			"insert into ui_application (creator,application_type,application_name, status_name) " +
                    "values (#{userName},#{appType},#{applicationName},'"+Constants.opened+"')";
	
	public static final String insertAppData =
	        "replace into ui_application (application_id," +
					"department_name, " +
                    "application_name," +
                    "application_type," +
                    "status_name," +
                    "latest_date_ts," +
                    "created_ts," +
                    "creator," +
                    "config_id," +
                    "uc4_jobplan_name," +
                    "uc4_job_name," +
                    "uc4_schedule_name," +
                    "hive_table_name," +
                    "schedule_type) " +
					"values (#{configId}," +
					"#{departmentName}," +
                    "#{applicationName}, " +
                    "#{applicationType}," +
                    "'"+Constants.approved+"'," +
                    "now()," +
                    "now()," +
                    "#{creator}," +
                    "#{configId}," +
                    "#{uc4JobplanName}," +
                    "#{uc4JobName}," +
                    "#{uc4ScheduleName}," +
                    "#{hiveTableName}," +
                    "#{scheduleType})";
	
	public static final String updateConfigData =
			"update ui_job_config set application_name=#{appName}, " +
					"job_group=#{jobGroup}, " +
                    "job_department=#{department}, " +
					"job_description=#{description}, " +
                    "source_class=#{source}, " +
					"source_uri=#{uriSource}, " +
                    "converter_classes=#{converter}, " +
					"writer_class=#{writer}, " +
                    "writer_partitioner_class=#{writerPartitioner}, " +
					"extract_class=#{extract}, " +
                    "extract_namespace=#{extractNamespace}, " +
					"service_name=#{serviceName}, " +
                    "publisher_type=#{publisherType}, " +
					"publisher_dir=#{publisherDir}, " +
                    "event_logger_xml_path=#{eventLoggerXmlPath}, " +
					"expect_run_ts=#{expectRunTime}, " +
                    "schedule_type=#{expectRunCycle}, " +
					"is_kafka=#{isKafka}, " +
                    "is_cal_multi=#{isCalMulti}, " +
					"with_compaction=#{withCompaction}," +
                    "compaction_schedule_type=#{compactionScheduleType}," +
                    "compaction_expect_run_ts=#{compactionExpectRunTs}," +
                    "application_type=#{applicationType}"+
					" where config_id=${configId}";
	
	public static final String insertJobConfigData =
			"insert into ui_job_config (" +
					"config_id," +
					"request_id, " +
                    "application_name, " +
                    "job_group, " +
                    "job_department, " +
                    "job_description, " +
                    "source_class, " +
                    "source_uri, " +
                    "converter_classes, " +
                    "writer_class, " +
                    "writer_partitioner_class, " +
                    "extract_class, " +
                    "extract_namespace, " +
                    "service_name, " +
                    "publisher_type, " +
                    "publisher_dir, " +
                    "event_logger_xml_path, " +
                    "expect_run_ts, " +
                    "schedule_type," +
                    "is_kafka," +
                    "is_cal_multi," +
                    "with_compaction," +
                    "application_type," +
                    "compaction_schedule_type," +
                    "compaction_expect_run_ts) values "
			+ "(#{requestId},#{requestId}, #{appName}, #{jobGroup}, #{department}, #{description}, #{source}, " +
                    "#{uriSource}, #{converter}, #{writer}, #{writerPartitioner}, #{extract}, " +
                    "#{extractNamespace}, #{serviceName}, #{publisherType}, #{publisherDir}, " +
                    "#{eventLoggerXmlPath}, #{expectRunTime}, #{expectRunCycle},#{isKafka},#{isCalMulti}," +
                    "#{withCompaction},#{applicationType},#{compactionScheduleType},#{compactionExpectRunTs})";
	
	public static final String updateRequestStatusApproved =
			"update ui_application set status_name='"+Constants.approved+"' where application_id=#{requestId}";
	
	public static final String updateRequestStatusDenied =
	"update ui_application set status_name='"+Constants.denied+"' where application_id=#{requestId}";
	
	public static final String getJobConfig = "SELECT * FROM ui_job_config where request_id = #{requestId}";

	public static final String getSchemaVersion = "SELECT max(version) FROM ui_schema " +
			"where application_name = #{applicationName} and schema_type = #{schema_type}";

	public static final String getLatestSchemaId = "SELECT max(schema_id) FROM ui_schema " +
            "where application_name = #{applicationName}";

	public static final String updateSchema = "INSERT INTO ui_schema " +
			"(version,user_id,upload_time,filepath,application_name,schema_type)VALUES" +
			"(#{newVersion},#{user},now(),#{filepath},#{applicationName},#{schema_type});";

    public static final String saveSchema = "INSERT INTO ui_schema " +
            "(version,user_id,upload_time,filepath,application_name,schema_type)VALUES" +
            "(#{version},#{user},now(),#{filepath},#{applicationName},#{schema_type});";

	public static final String getRequestRecordDetails = "SELECT r.request_name as request_name,r.request_id as request_id," +
            "(select u.user_name from ui_job_user as u where u.user_id=r.user_id) as user_id," +
            "(select s.request_status from ui_request_status_map as s where s.status_id=r.status) as status," +
            "r.created_ts as created_ts FROM ui_job_request as r where r.request_id = #{requestId}";
	
	public static final String getConfigDetailByRequest = "SELECT * FROM ui_job_config where request_id = #{requestId}";
	
	public static final String validAppNameRepeat = "SELECT count(*) FROM ui_application where application_name= #{appName}";
	
	public static final String getAllRequestsByStatus = "SELECT " +
			"r.application_name," +
			"r.application_id," +
			"r.creator," +
			"r.status_name," +
			"r.created_ts " +
			"FROM ui_application as r " +
			"where r.status_name = #{status} " +
			"order by r.created_ts DESC";
	
	public static final String getUserRequestsByStatus = "SELECT " +
            "r.application_name," +
            "r.request_id," +
            "r.creator as user_id" +
            "r.status_name," +
            "r.created_ts," +
            "FROM ui_application as r " +
            "where r.status_name = #{status} and " +
            "r.user_id = #{userId}" +
            "order by r.created_ts DESC";

	public static final String getDownLoadFileName = "SELECT request_id FROM ui_job_config ujc JOIN ui_application ua " +
            "ON ujc.application_name = ua.application_name WHERE ua.application_id = #{applicationId}";
	
	public static final String getJobRunDetail = "SELECT "
		+ "job.job_id AS job_id,"
		+ "job.job_name AS job_name,"
		+ "job.state AS job_status,"
        + "app.application_name AS application_name,"
        + "app.application_type AS application_type,"
        + "app.schedule_type AS schedule_type," 
        + "CAST(job.start_time AS DATE) AS Start_Date,"
        + "CAST(job.end_time AS DATE) AS End_Date,"
        + "job.start_time AS start_time,"
        + "job.end_time AS end_time,"
        + "TIMESTAMPDIFF(SECOND,job.start_time,job.end_time) AS duration_seconds,"
        + "jobm.read_bytes AS read_bytes,"
        + "jobm.write_bytes AS write_bytes,"
        + "jobm.read_records AS read_records,"
        + "jobm.write_records AS write_records"
        + " FROM"
        + " (((gobblin_job_executions job"
        + " JOIN ui_job_metrics jobm)"
        + " JOIN ui_application_job_executions app_job)"
        + " JOIN ui_application app)"
        + " WHERE"
        + " job.start_time > (SELECT max(start_time) FROM fact_job_run_detail)"
		+ " AND job.state = 'COMMITTED'"
        //+ " job.start_time >= DATE_SUB(NOW(),INTERVAL 5 MINUTE)" //add the 'where' to filter out jobs data before 5 min.
        + " AND ((job.job_id = app_job.job_id)"
        + " AND (job.job_id = jobm.job_id)"
        + " AND (app_job.application_id = app.application_id))";
	
	public static final String insertJobRunDetail =
			"replace into fact_job_run_detail "
			+ "(job_id,job_name,job_status,application_name,application_type,schedule_type,Start_Date,End_Date," +
                    "start_time,end_time,duration_seconds,read_bytes,write_bytes,read_records,write_records," +
                    "create_ts,update_ts) values "
			+ "(#{jobId},#{jobName},#{jobStatus},#{appName},#{appType},#{scheduleType},#{startDate},#{endDate}," +
                    "#{startTime},#{endTime},#{durationSeconds},#{readBytes},#{writeBytes},#{readRecords}," +
                    "#{writeRecords},now(),now())";

    public static final String getAppStatistic = "Select app.application_name,"
    		//+ " app.application_type,"
    		+ " app.application_type,"
    		+ " app.schedule_type,"
    		/*+ " (select max(job.end_time)-min(job.start_time)"
            + " from gobblin_job_executions job" 
            + " join ui_application_job_executions appJob"
            + " on job.job_id=appJob.job_id"
            + " join ui_application app"
            + " on appJob.application_id=app.application_id)as duration_seconds,"*/
            + " (select count(*)"
            + " from gobblin_job_executions job"
            + " join ui_application_job_executions appJob"
            + " on job.job_id=appJob.job_id"
            + " join ui_application app"
            + " on appJob.application_id=app.application_id"
            + " where job.state='COMMITTED') as success_job_cnt,"
            + " (select count(*)"
            + " from"
            + " gobblin_job_executions job"
            + " join ui_application_job_executions appJob"
            + " on job.job_id=appJob.job_id"
            + " join ui_application app"
            + " on appJob.application_id=app.application_id"
            + " where job.state='FAILED') as fail_job_cnt,"
            + " (select count(*)"
            + " from gobblin_job_executions job"
            + " join ui_application_job_executions appJob"
            + " on job.job_id=appJob.job_id"
            + " join ui_application app"
            + " on appJob.application_id=app.application_id) as total_job_cnt,"
            + " m.read_bytes as read_bytes,"
            + " m.write_bytes as write_bytes,"
            + " m.read_records read_records,"
            + " m.write_records write_records" 
            + " from ui_application app"
            + " left join ui_application_metrics m"
            + " on app.application_id=m.application_id;";

    public static final String insertAppStatistic =   //now() - date_sub(now(),interval 1 day)
			"replace into fact_application_summary "
			+ "(application_name,calendar_date,application_type,schedule_type,success_job_cnt,fail_job_cnt," +
                    "total_job_cnt,read_bytes,write_bytes,read_records,write_records,create_ts,update_ts) values "
			//+ "(#{appName},date_sub(now(),interval 1 day),#{appType},#{scheduleType},#{succJobCnt},#{failJobCnt},#{totalJobCnt},#{readBytes},#{writeBytes},#{readRecords},#{writeRecords},now(),now())";
			+ "(#{appName},now(),#{appType},#{scheduleType},#{succJobCnt},#{failJobCnt},#{totalJobCnt},#{readBytes}," +
                    "#{writeBytes},#{readRecords},#{writeRecords},now(),now())";
    
    public static final String getOverall = "Select "
    		+ " (select count(*) from ui_application) as application_cnt,"
    		+ " (select count(*) from ui_application where application_type='BIZLOGGING') as bizlogging_cnt,"
    		+ " (select count(*) from ui_application where application_type='CAL') as cal_cnt,"
    		+ " (select count(*) from ui_application where application_type not in ('BIZLOGGING','CAL')) as others_cnt,"
            + " (select count(*) from gobblin_job_executions job join ui_application_job_executions appJob " +
            "on job.job_id=appJob.job_id where job.state='COMMITTED') as success_job_cnt,"
            + " (select count(*) from gobblin_job_executions job join ui_application_job_executions appJob " +
            "on job.job_id=appJob.job_id where job.state='FAILED') as fail_job_cnt,"
            + " (select count(*) from ui_application_job_executions)total_job_cnt,"
            + " sum(metrics.read_bytes),"
            + " sum(metrics.write_bytes),"
            + " sum(metrics.read_records),"
            + " sum(metrics.write_records)" 
            + " from ui_application_metrics metrics";
    
    public static final String insertOverall =    //now() - date_sub(now(),interval 1 day)
			"replace into fact_overall_history "
			+ "(calendar_date,application_cnt,bizlogging_cnt,cal_cnt,others_cnt," +
					"success_job_cnt,fail_job_cnt,total_job_cnt,read_bytes," +
					"write_bytes,read_records,write_records,create_ts,update_ts) values "
			//+ "(date_sub(now(),interval 1 day),#{appCnt},#{bizloggingCnt},#{calCnt},#{othersCnt}," +
			+ "(now(),#{appCnt},#{bizloggingCnt},#{calCnt},#{othersCnt}," +
					"#{succJobCnt},#{failJobCnt},#{totalJobCnt},#{readBytes}," +
					"#{writeBytes},#{readRecords},#{writeRecords},now(),now())";

    public static final String updateJobDataCount =
			"SELECT count(*) FROM gobblin_job_executions where start_time > (SELECT max(start_time) FROM fact_job_run_detail);";
}

