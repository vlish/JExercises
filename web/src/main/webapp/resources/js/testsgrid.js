/**
 * Created by Ihor Demkovych on 16.02.15.
 */
var searchParametersDto = {
    pagesize:10,
    pagenumber:0,
    searchKey:"",
    order:"desc",
    draw:0
};
$(document).ready(function () {
    var table = $('#testsGrid').DataTable({
        processing: true,
        serverSide: true,
        ajax: {
            url: "/web/testsgrid",
            type: 'POST',
            mimeType: 'application/json',
            contentType: 'application/json',
            processData: false,
            beforeSend: function (jqXHR, settings) {
                var data = settings.data;
                searchParametersDto.draw = data.draw;
                searchParametersDto.pagenumber = data.start;
                searchParametersDto.pagesize = data.length;
                searchParametersDto.order = data.order[0].dir;
                searchParametersDto.searchKey = data.search.value;
                data = searchParametersDto;
                settings.data = JSON.stringify(data);
            },
            dataSrc: "testGridRows"
        },
        columns: [
            {data: "description"},
            {data: "isPublic", bSortable: false},
            {data: null, bSortable: false,
                defaultContent:
                '<button class="btn btn-danger pull-right">' +
                    '<span class="glyphicon glyphicon-trash"></span> Delete</button>'+
                '<button class="btn btn-warning pull-right">' +
                    '<span class="glyphicon glyphicon-pencil"></span> Edit</button>'+
                '<button class="btn btn-success pull-right">' +
                    '<span class="glyphicon glyphicon-list-alt"></span> Attempts</button>' +
                '<button class="btn btn-primary pull-right">' +
                    '<span class="glyphicon glyphicon-eye-open"></span> View</button>'
            }
        ]
    });

    $('#testgrid_wrapper').removeClass('dataTables_wrapper');

    $('#testsGrid tbody').on('click', '.btn-primary', function () {
        var id = table.row( $(this).parents('tr') ).data().id;
        $.ajax({
                url: "/web/testsgrid/view",
                type: 'GET',
                mimeType: 'application/json',
                contentType: 'application/json',
                data: JSON.stringify(id),
                success: function (dataResponse) {}
            }
        );
    });

    $('#testsGrid tbody').on('click', '.btn-success', function () {
        var id = table.row( $(this).parents('tr') ).data().id;
        $.ajax({
                url: "/web/testsgrid/attempts",
                type: 'GET',
                mimeType: 'application/json',
                contentType: 'application/json',
                data: JSON.stringify(id),
                success: function (dataResponse) {}
            }
        );
    });

    $('#testsGrid tbody').on('click', '.btn-warning', function () {
        var id = table.row( $(this).parents('tr') ).data().id;
        $.ajax({
                url: "/web/testsgrid/edit",
                type: 'GET',
                mimeType: 'application/json',
                contentType: 'application/json',
                data: JSON.stringify(id),
                success: function (dataResponse) {}
            }
        );
    });

    $('#testsGrid tbody').on('click', '.btn-danger', function () {
        var id = table.row( $(this).parents('tr') ).data().id;
        $.ajax({
                type: "POST",
                url: "/web/testdelete",
                data: JSON.stringify(id),
                contentType: "application/json; charset=utf-8",
                dataType:"json"
            }
        );
    });

    $('.btn-default').on('click', function () {
        $.ajax({
                url: "/web/testsgrid/add",
                type: 'GET',
                mimeType: 'application/json',
                contentType: 'application/json',
                data: JSON.stringify(id),
                success: function (dataResponse) {}
            }
        );
    });
});