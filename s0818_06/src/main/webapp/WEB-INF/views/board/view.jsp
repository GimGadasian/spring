<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Board Page</title>
    <style>
        h2, h3 { text-align: center; }
        table { width: 400px; margin: 10px auto; }
        table, th, td { border: 1px solid black; border-collapse: collapse; }
        th, td { width: 200px; height: 40px; text-align: center; }
    </style>
</head>
<body>
    <h2>Board Page</h2>
    <table>
        <tr>
            <th>No</th>
            <td>${boardDto.bno}</td>
        </tr>
        <tr>
            <th>Title</th>
            <td>${boardDto.btitle}</td>
        </tr>
        <tr>
            <th>Writer</th>
            <td>${boardDto.bwriter}</td>
        </tr>
        <tr>
            <th>Content</th>
            <td>${boardDto.bcontent}</td>
        </tr>
        <tr>
            <th>Date</th>
            <td>${boardDto.bdate}</td>
        </tr>
        <tr>
            <th>Visited</th>
            <td>${boardDto.bhit}</td>
        </tr>
    </table>
    <br>
    <h3><a href="/">Home</a></h3>
</body>
</html>