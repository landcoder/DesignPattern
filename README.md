# DesignPattern 设计模式

##设计模式的分类
* 总体来说设计模式分为三大类：

	* 创建型模式(共五种)：
		* [工厂方法模式](#c_factory)
		* [抽象工厂模式](#a_factory)
		* 单例模式
		* 建造者模式
		* 原型模式

	* 结构型模式(共七种)：
		* 适配器模式
		* 装饰器模式
		* 代理模式
		* 外观模式
		* 桥接模式
		* 组合模式
		* 享元模式

	* 行为型模式(共十一种)：
		* 策略模式
		* 模板方法模式
		* 观察者模式
		* 迭代子模式
		* 责任链模式
		* 命令模式
		* 备忘录模式
		* 状态模式
		* 访问者模式
		* 中介者模式
		* 解释器模式

***
###<span id="c_factory">工厂设计模式(factory)</span>
* 1 工厂模式
	* 1 普通工厂
	<p>就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。</p>
	![1.jpg](http://dl.iteye.com/upload/attachment/0083/1180/421a1a3f-6777-3bca-85d7-00fc60c1ae8b.png?_=3023236)
	
	* 2 多工厂方法
	<p>
	是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，<br>
	而多个工厂方法模式是提供多个工厂方法，分别创建对象。
	</p>
	![1.jpg](http://dl.iteye.com/upload/attachment/0083/1181/84673ccf-ef89-3774-b5cf-6d2523cd03e5.jpg?_=3023236)
	
	* 3 静态工厂方法
	<p>将多工厂方法模式中的方法设为静态，不需要创建实力，即可直接调用。</p>
	
* 2 <span id = "a_factory">抽象工厂模式</span>
	<p>
	普通的工厂方法模式，类的创建以来工厂，如果扩展程序，需要对工厂类进行修改，这违背了闭包原则，<br>
	这种时候就考虑使用抽象工厂方法，添加新功能只要添加新工厂就行，不用修改原来代码。
	</p>
	![1.jpg](http://dl.iteye.com/upload/attachment/0083/1185/34a0f8de-16e0-3cd5-9f69-257fcb2be742.jpg?_=3023236)

***
###singleton 单例设计模式

***
###builder 建造者模式

***
###prototype 原型模式

***
###adapter 适配器模式

***
###decorator 装饰器模式

***
###proxy 代理模式

***
###facade 外观模式

***
###bridge 桥接模式

***
###composite 组合模式

***
###flyweight 享元模式

***
###strategy 策略模式

***
###template_method 模板方法模式

***
###observer 观察者模式

***
###iterator 迭代子模式

***
###chain_of_responsibility 责任链模式

***
###command 命令模式

***
###memento 备忘录模式

***
###visitor 访问者模式

***
###mediator 中介者模式

***
###interpretor 解释器模式

***
###state 状态设计模式 

