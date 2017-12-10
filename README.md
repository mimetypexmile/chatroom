# chatroom
chatroom project init

play
页面向后台发出请求Action=@{Application.方法名} method=get/post 在 项目/conf/routes下写  play 对restful 风格的支持非常好
(关于restful :)

render(Object...args) 实质是renderTemplate 将相应的参数与模板整合
生成的模板的名字：eg 
public static void index() {
        render();
    }
生成的模板名称为index.html、方法名与模板名称一样
（ps:如果做实时聊天系统，不知道如何将新增的数据展示到当前的页面）


