<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <%@ include file="../base.jsp" %>
    <%@ include file="../navigation.jsp" %>
    <script src="${basedir}/resources/js/testinprocess.js"></script>
    <link href="${basedir}/resources/css/test-in-process.css" rel="stylesheet" type="text/css">
</head>
<body id="container">
<div class="container">
    <div class="row">
        <div class="col-xs-10 col-sm-10 col-md-8 col-lg-8 col-xs-offset-1 col-sm-offset-1 col-md-offset-2 col-lg-offset-2 ">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <div class="h4" id="panel-title"></div>
                </div>
                <div class="container-fluid">
                    <div class="col-md-10 col-lg-10 col-md-offset-1 col-md-offset-1">
                        <div class="question-description-panel">
                            <div id="question-description"></div>
                        </div>
                        <hr class="separate-line"/>
                        <div class="form-group">
                            <div class="question-answer">
                                <label for="question-answer">Answer:</label>
                            </div>
                        <textarea class="form-control" rows="8" id="question-answer"
                                  placeholder="Input answer..."></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-2 col-md-offset-1 ">
                            <button id="btnprev" type="button" class="btn btn-success btn-block"><span
                                    class="glyphicon glyphicon-arrow-left"></span></button>
                        </div>
                        <div class="col-md-2 col-md-offset-6 " id="btnnext">
                            <button type="button" class="btn btn-success btn-block"><span
                                    class="glyphicon glyphicon-arrow-right"></span></button>
                        </div>
                        <div class="col-md-2 col-md-offset-6" id="btnfinish">
                            <button type="button" class="btn btn-primary btn-block">
                                <span class="glyphicon glyphicon-ok"></span></button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>