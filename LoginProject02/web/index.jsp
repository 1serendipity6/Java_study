<%--
  Created by IntelliJ IDEA.
  User: Leo
  Date: 2024/7/9
  Time: 上午 08:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>首页</title>
  <style>
    body, html {
      margin: 0;
      padding: 0;
      font-family: Arial, sans-serif;
    }

    header {
      background-color: #333;
      color: white;
      padding: 10px 20px;
      text-align: center;
    }

    header nav ul {
      list-style: none;
      padding: 0;
      display: flex;
      justify-content: center;
    }

    header nav ul li {
      margin: 0 10px;
    }

    header nav ul li a {
      color: white;
      text-decoration: none;
    }

    section {
      padding: 20px;
      margin: 20px 0;
    }

    .portfolio-items {
      display: flex;
      justify-content: space-around;
    }

    .portfolio-item {
      border: 1px solid #ddd;
      padding: 10px;
      margin: 5px;
      width: 30%;
      text-align: center;
    }

    footer {
      background-color: #333;
      color: white;
      text-align: center;
      padding: 10px 20px;
    }

    input, textarea {
      width: 100%;
      padding: 10px;
      margin-bottom: 10px;
      border: 1px solid #ddd;
    }

    button {
      padding: 10px 20px;
      background-color: #5cb85c;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    button:hover {
      background-color: #4cae4c;
    }
  </style>
</head>
<body>
<header>
  <h1>欢迎来到我的网站</h1>
  <nav>
    <ul>
      <li><a href="#about">关于我们</a></li>
      <li><a href="#services">服务</a></li>
      <li><a href="#portfolio">作品集</a></li>
      <li><a href="#contact">联系我们</a></li>
    </ul>
  </nav>
</header>

<section id="about">
  <h2>关于我们</h2>
  <p>这里是关于我们的介绍内容。</p>
</section>

<section id="services">
  <h2>我们的服务</h2>
  <p>这里是我们提供的服务内容。</p>
</section>

<section id="portfolio">
  <h2>作品集</h2>
  <div class="portfolio-items">
    <div class="portfolio-item">作品集项目1</div>
    <div class="portfolio-item">作品集项目2</div>
    <div class="portfolio-item">作品集项目3</div>
  </div>
</section>

<section id="contact">
  <h2>联系我们</h2>
  <form action="#" method="post">
    <input type="text" placeholder="你的名字" required>
    <input type="email" placeholder="你的邮箱" required>
    <textarea placeholder="你的消息" required></textarea>
    <button type="submit">发送消息</button>
  </form>
</section>

<footer>
  <p>&copy; 2024 我的网站. 版权所有.</p>
</footer>

<script src="script.js"></script>
</body>
</html>

