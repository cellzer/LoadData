package hello.example.ql.test003.bean;

import java.util.List;

/**
 * Created by walmand_ on 2015/7/15 0015.
 */
public class DataBean {

    @Override
    public String toString() {
        return "DataBean{" +
                "Task=" + Task +
                ", TaskParams=" + TaskParams +
                ", IsRelationRegion=" + IsRelationRegion +
                ", RegionR3MViews='" + RegionR3MViews + '\'' +
                '}';
    }

    //    "Task": {},
//            "TaskParams": [],
//            "IsRelationRegion": false,
//            "RegionR3MViews": null
    public Task Task;
    public List<TaskParams> TaskParams;
    public boolean IsRelationRegion;
    public String RegionR3MViews;


    public class Task {
        @Override
        public String toString() {
            return "Task{" +
                    "TaskId=" + TaskId +
                    ", TaskTypeId=" + TaskTypeId +
                    ", ReportPeriod='" + ReportPeriod + '\'' +
                    ", ReportDate='" + ReportDate + '\'' +
                    ", IsVisitTask=" + IsVisitTask +
                    ", TaskLetter='" + TaskLetter + '\'' +
                    ", TaskName='" + TaskName + '\'' +
                    ", ResultTableName='" + ResultTableName + '\'' +
                    ", Processor='" + Processor + '\'' +
                    ", IsEnable=" + IsEnable +
                    ", HasPicture=" + HasPicture +
                    ", PictureIsRequired=" + PictureIsRequired +
                    ", PictureName='" + PictureName + '\'' +
                    ", PictureModeId=" + PictureModeId +
                    ", HasLocate=" + HasLocate +
                    ", LocateIsRequired=" + LocateIsRequired +
                    ", LocateName='" + LocateName + '\'' +
                    ", HasScanning=" + HasScanning +
                    ", ScanningIsRequired=" + ScanningIsRequired +
                    ", ScanningName='" + ScanningName + '\'' +
                    ", RepairDay=" + RepairDay +
                    ", TaskReportTypeId=" + TaskReportTypeId +
                    ", TaskReportDemo='" + TaskReportDemo + '\'' +
                    ", ImmediateResponseId=" + ImmediateResponseId +
                    ", IsSkipProcessor=" + IsSkipProcessor +
                    ", InsertTime='" + InsertTime + '\'' +
                    ", Operator='" + Operator + '\'' +
                    ", IsStandardTask=" + IsStandardTask +
                    ", OrderNumber=" + OrderNumber +
                    ", GroupCount=" + GroupCount +
                    ", GroupTitle='" + GroupTitle + '\'' +
                    ", TaskTemplateId=" + TaskTemplateId +
                    ", PictureRemark1='" + PictureRemark1 + '\'' +
                    ", PictureRemark2='" + PictureRemark2 + '\'' +
                    ", PictureRemark3='" + PictureRemark3 + '\'' +
                    ", LocateRemark1='" + LocateRemark1 + '\'' +
                    ", LocateRemark2='" + LocateRemark2 + '\'' +
                    ", LocateRemark3='" + LocateRemark3 + '\'' +
                    ", ScanningRemark1='" + ScanningRemark1 + '\'' +
                    ", ScanningRemark2='" + ScanningRemark2 + '\'' +
                    ", ScanningRemark3='" + ScanningRemark3 + '\'' +
                    ", OptionalTimeType=" + OptionalTimeType +
                    ", ScanContentFormatRegex='" + ScanContentFormatRegex + '\'' +
                    ", ScanContentMustExist=" + ScanContentMustExist +
                    ", ProcessAuthorizationId=" + ProcessAuthorizationId +
                    '}';
        }

        //        "TaskId": 71,
        public int TaskId;
        //                "TaskTypeId": 3,
        public int TaskTypeId;
        //                "ReportPeriod": "日报",
        public String ReportPeriod;
        //                "ReportDate": "日报",
        public String ReportDate;
        //                "IsVisitTask": false,
        public boolean IsVisitTask;
        //                "TaskLetter": "BB",
        public String TaskLetter;
        //                "TaskName": "人资料激活",
        public String TaskName;
        //                "ResultTableName": "[dbo].[Data_Result_Reporter_A]",
        public String ResultTableName;
        //                "Processor": "ReporterADCProcessor",
        public String Processor;
        //                "IsEnable": true,
        public boolean IsEnable;
        //                "HasPicture": false,
        public boolean HasPicture;
        //                "PictureIsRequired": false,
        public boolean PictureIsRequired;
        //                "PictureName": "拍照",
        public String PictureName;
        //                "PictureModeId": 1,
        public int PictureModeId;
        //                "HasLocate": false,
        public boolean HasLocate;
        //                "LocateIsRequired": false,
        public boolean LocateIsRequired;
        //                "LocateName": "定位",
        public String LocateName;
        //                "HasScanning": false,
        public boolean HasScanning;
        //                "ScanningIsRequired": false,
        public boolean ScanningIsRequired;
        //                "ScanningName": "扫描",
        public String ScanningName;
        //                "RepairDay": 0,
        public int RepairDay;
        //                "TaskReportTypeId": 2,
        public int TaskReportTypeId;
        //                "TaskReportDemo": "",
        public String TaskReportDemo;
        //                "ImmediateResponseId": 0,
        public int ImmediateResponseId;
        //                "IsSkipProcessor": false,
        public boolean IsSkipProcessor;
        //                "InsertTime": "2013-09-14 11:20:02.697",
        public String InsertTime;
        //                "Operator": "黎少辉",
        public String Operator;
        //                "IsStandardTask": true,
        public boolean IsStandardTask;
        //                "OrderNumber": 0,
        public String OrderNumber;
        //                "GroupCount": 1,
        public int GroupCount;
        //                "GroupTitle": "第[i]组",
        public String GroupTitle;
        //                "TaskTemplateId": 25,
        public int TaskTemplateId;
        //                "PictureRemark1": "备注1",
        public String PictureRemark1;
        //                "PictureRemark2": "备注2",
        public String PictureRemark2;
        //                "PictureRemark3": "备注3",
        public String PictureRemark3;
        //                "LocateRemark1": "备注1",
        public String LocateRemark1;
        //                "LocateRemark2": "备注2",
        public String LocateRemark2;
        //                "LocateRemark3": "备注3",
        public String LocateRemark3;
        //                "ScanningRemark1": "备注1",
        public String ScanningRemark1;
        //                "ScanningRemark2": "备注2",
        public String ScanningRemark2;
        //                "ScanningRemark3": "备注3",
        public String ScanningRemark3;
        //                "OptionalTimeType": 0,
        public int OptionalTimeType;
        //                "ScanContentFormatRegex": "^\\d{4'}-\\d{4}-\\d{4}$",
        public String ScanContentFormatRegex;
        //                "ScanContentMustExist": false,
        public boolean ScanContentMustExist;
        //                "ProcessAuthorizationId": 2
        public int ProcessAuthorizationId;


    }

    public class TaskParams {
        @Override
        public String toString() {
            return "TaskParams{" +
                    "TaskParamId=" + TaskParamId +
                    ", TaskId=" + TaskId +
                    ", TaskParamName='" + TaskParamName + '\'' +
                    ", IndividualTaskParamName='" + IndividualTaskParamName + '\'' +
                    ", TaskParamType='" + TaskParamType + '\'' +
                    ", TaskParamOrder=" + TaskParamOrder +
                    ", ResultTableFieldName='" + ResultTableFieldName + '\'' +
                    ", IndividualMaxLength=" + IndividualMaxLength +
                    ", SystemMaxLength=" + SystemMaxLength +
                    ", Minimum=" + Minimum +
                    ", Maximum=" + Maximum +
                    ", GreaterThanTaskParamOrder=" + GreaterThanTaskParamOrder +
                    ", DependentTaskParamParamOrder=" + DependentTaskParamParamOrder +
                    ", ParamTableValueColumn='" + ParamTableValueColumn + '\'' +
                    ", ParamTableTextColumn='" + ParamTableTextColumn + '\'' +
                    ", ParamTableName='" + ParamTableName + '\'' +
                    ", IsEnable=" + IsEnable +
                    ", IsVisible=" + IsVisible +
                    ", DefaultText='" + DefaultText + '\'' +
                    ", DefaultValue='" + DefaultValue + '\'' +
                    ", FormatRegex='" + FormatRegex + '\'' +
                    ", OrderNumber=" + OrderNumber +
                    ", IsRequired=" + IsRequired +
                    ", ButtonCellModeId=" + ButtonCellModeId +
                    '}';
        }

        //                "TaskParamId": 1298,
        public int TaskParamId;
        //                "TaskId": 71,
        public int TaskId;
        //                "TaskParamName": "手机号码",
        public String TaskParamName;
        //                "IndividualTaskParamName": "手机号码",
        public String IndividualTaskParamName;
        //                "TaskParamType": "PhoneNumber",
        public String TaskParamType;
        //                "TaskParamOrder": 1,
        public int TaskParamOrder;
        //                "ResultTableFieldName": "PhoneNumber",
        public String ResultTableFieldName;
        //                "IndividualMaxLength": 0,
        public int IndividualMaxLength;
        //                "SystemMaxLength": 0,
        public int SystemMaxLength;
        //                "Minimum": 0,
        public int Minimum;
        //                "Maximum": 0,
        public int Maximum;
        //                "GreaterThanTaskParamOrder": 0,
        public int GreaterThanTaskParamOrder;
        //                "DependentTaskParamParamOrder": 0,
        public int DependentTaskParamParamOrder;
        //                "ParamTableValueColumn": null,
        public String ParamTableValueColumn;
        //                "ParamTableTextColumn": null,
        public String ParamTableTextColumn;
        //                "ParamTableName": null,
        public String ParamTableName;
        //                "IsEnable": true,
        public boolean IsEnable;
        //                "IsVisible": true,
        public boolean IsVisible;
        //                "DefaultText": null,
        public String DefaultText;
        //                "DefaultValue": null,
        public String DefaultValue;
        //                "FormatRegex": "^1[0-9]{10}$",
        public String FormatRegex;
        //                "OrderNumber": 0,
        public String OrderNumber;
        //                "IsRequired": true,
        public boolean IsRequired;
        //                "ButtonCellModeId": 2
        public int ButtonCellModeId;

    }
}
