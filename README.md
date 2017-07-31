#设计模式

##设计模式的分类
* 总体来说设计模式分为三大类：

	* 创建型模式(共五种)：
		* [工厂方法模式](#c_factory)
		* [抽象工厂模式](#a_factory)
		* [单例模式](#singleton)
		* [建造者模式](#builder)
		* [原型模式](#prototype)

	* 结构型模式(共七种)：
		* [适配器模式](#adapter)
		* [装饰器模式](#decorator)
		* [代理模式](#proxy)
		* [外观模式](#facade)
		* [桥接模式](#bridge)
		* [组合模式](#composite)
		* [享元模式](#flyweight)

	* 行为型模式(共十一种)：
		* [策略模式](#strategy)
		* [模板方法模式](#template_method)
		* [观察者模式](#observer)
		* [迭代子模式](#iterator)
		* [责任链模式](#chain_of_responsibility)
		* [命令模式](#command)
		* [备忘录模式](#memento)
		* [状态模式](#state)
		* [访问者模式](#visitor)
		* [中介者模式](#mediator)
		* [解释器模式](#interpretor)

***

##设计模式六大原则
* 开闭原则(Open Close Principle)
	* <p>开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。</p> 
* 里氏代换原则(Liskov Substitution Principle)
	* <p>里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。</p> 
* 依赖倒转原则(Dependence Inversion Principle)
	* <p>这个是开闭原则的基础，具体内容：真对接口编程，依赖于抽象而不依赖于具体。</p> 
* 接口隔离原则(Interface Segregation Principle)
	* <p>这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。</p> 
* 迪米特法则(Demeter Principle)
	* <p>为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。</p> 
* 合成复用原则(Composite Reuse Principle)
	* <p>原则是尽量使用合成/聚合的方式，而不是使用继承。</p> 

##设计模式详细介绍

###<a id="c_factory">工厂设计模式(factory)</a>
* 1 工厂模式
	* 普通工厂
	<p>就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。</p>
	![1.jpg](http://dl.iteye.com/upload/attachment/0083/1180/421a1a3f-6777-3bca-85d7-00fc60c1ae8b.png?_=3023236)
	
	* 多工厂方法
	<p>
	是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，<br>
	而多个工厂方法模式是提供多个工厂方法，分别创建对象。
	</p>
	![1.jpg](http://dl.iteye.com/upload/attachment/0083/1181/84673ccf-ef89-3774-b5cf-6d2523cd03e5.jpg?_=3023236)
	
	* 静态工厂方法
	<p>将多工厂方法模式中的方法设为静态，不需要创建实力，即可直接调用。</p>
	
* 2 <a id = "a_factory">抽象工厂模式</a>
	<p>
	普通的工厂方法模式，类的创建以来工厂，如果扩展程序，需要对工厂类进行修改，这违背了闭包原则，<br>
	这种时候就考虑使用抽象工厂方法，添加新功能只要添加新工厂就行，不用修改原来代码。
	</p>
	![1.jpg](http://dl.iteye.com/upload/attachment/0083/1185/34a0f8de-16e0-3cd5-9f69-257fcb2be742.jpg?_=3023236)

***
###<a id = "singleton">单例设计模式(singleton)</a>
* 单例模式介绍(在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。)
	* 某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
	* 省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
	* 有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。（比如一个军队出现了多个司令员同时指挥，肯定会乱成一团），所以只有使用单例模式，才能保证核心交易服务器独立控制整个流程。
* 单例模式总结
	* 单例模式理解起来简单，但是具体实现还是有一定难度。
	* synchronized关键字锁定的是对象，使用时，一定要在恰当的地方使用(需要注意使用锁的对象和过程，可能有时候并不是整个对象或过程都需要锁)。

***
###<a id = "builder">建造者模式(builder)</a>
* 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是抽象工厂模式和最后的Test程序结合得到的。
* 建造者模式将很多功能集成到一个类里，这个类可以创造比较复杂的东西，所以选择工厂模式还是建造者模式，需要根据实际情况而定。

***
###<a id = "prototype">原型模式(prototype)</a>
* 原型模式是创建型的模式，但是与工程模式没关系。
* 从名字可以看出，该模式是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
* 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
* 深复制：讲一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。(深复制进行了完全彻底的复制，而浅复制不彻底。)

***
###<a id = "adapter">适配器模式(adapter)</a>
* 类的适配器模式
<p>当希望将一个类转换成满足另一个新接口的类时可以使用类的适配器模式，创建一个新类，集成原有的类，实现新的接口即可。</p>
![1.jpg](http://dl.iteye.com/upload/attachment/0083/1189/6b2d13aa-7cc7-3e98-9764-bdcb2c64f795.jpg?_=3023236)

* 对象的适配器模式
<p>当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。</p>
![1.jpg](http://dl.iteye.com/upload/attachment/0083/1191/0aabe35b-5b79-3ead-838f-9d4b6fbd774d.jpg?_=3023236)

* 接口的适配器模式
<p>当不希望实现一个借口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，集成抽象类即可。</p>
![1.jpg](http://dl.iteye.com/upload/attachment/0083/1193/a604fca8-e0c6-3e4e-b00a-49da21595b4e.jpg?_=3023236)

***
###<a id = "decorator">装饰器模式(decorator)</a>
<p>动态的给一个对象添加一些新功能，装饰对象和被装饰对象实现同一个借口，装饰对象持有被装饰对象的实例。</p>

* 应用场景：
	* 1、需要扩展一个类的功能；
	* 2、动态的为一个对象增加功能，而且还能动态撤销(继承的功能是静态的，不能动态删除)。
	
![1.jpg](http://dl.iteye.com/upload/attachment/0083/1195/e1b8b6a3-0150-31ae-8f77-7c3d888b6f80.jpg?_=3023236)

***
###<a id = "proxy">代理模式(proxy)</a>
<p>代理模式就是找个中间人替自己做自己不方便做的事。</p>

* 应用场景：
	*  不修改原有类的方法，来对其进行扩展；
	*  采用一个代理类调用原有的方法，且对产生的结果进行控制。

![1.jpg](http://dl.iteye.com/upload/attachment/0083/1197/ea094ad9-efc5-337d-a8e8-ce9223511144.jpg?_=3023236)

***
###<a id = "facade">外观模式(facade)</a>
<p>外观模式为了解决类和类之间的依赖关系，将类和类放到一个Facade钟，降低类类之间的耦合度，该模式不涉及任何接口。</p>

![1.jpg](http://dl.iteye.com/upload/attachment/0083/1199/eebe2103-6ced-35f2-8664-3a2e8a557f81.jpg?_=3023236)

***
###<a id = "bridge">桥接模式(bridge)</a>
<p>桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。</p>

![1.jpg](http://dl.iteye.com/upload/attachment/0083/1201/35f0b172-b976-3757-bb51-c65d5c9ce68e.jpg?_=3023236)

<p>我们常用的JDBC桥DriverManager就是桥接模式，JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫数据库驱动的程序来桥接就行了。</p>

![1.jpg](http://dl.iteye.com/upload/attachment/0083/1203/6f713d07-1409-3312-99c9-fa6b0909f0b2.jpg?_=3023236)

***
###<a id = "composite">组合模式(composite)</a>
<p>又称部分-整体模式，在处理类似树形结构的问题时比较方便。</p>

* 应用场景：
	* 将多个对象组合在一起进行操作；
	* 常用于表示树形结构中，例如二叉树等。

![1.jpg](http://dl.iteye.com/upload/attachment/0083/1205/09cab656-5ff9-380e-9df1-326339ac3509.jpg?_=3023236)

***
###<a id = "flyweight">享元模式(flyweight)</a>
<p>享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。</p>

![1.jpg](http://dl.iteye.com/upload/attachment/0083/1209/53bc0bf4-cafb-3a12-8574-e20a525f2b72.jpg?_=3023236)

***
###<a id = "strategy">策略模式(strategy)</a>
<p>策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类(可有可无，属于辅助类)，提供辅助函数。</p>

* 应用场景：
	* 策略模式决定权在用户，系统本身提供不同算法的实现，新增或删除算法，对各种算法做封装；
	* 策略模式多用于算法决策系统中，外部用户只需要决定用哪种算法即可。

![1.jpg](http://dl.iteye.com/upload/attachment/0083/1213/2319a2c3-7ebd-3ee3-b389-1548074ea9c6.jpg?_=3023236)

***
###<a id = "template_method">模板方法模式(template method)</a>
<p>一个抽象类中，有一个主方法，再定义1...N个方法，可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用。</p>

![1.jpg](http://dl.iteye.com/upload/attachment/0083/1215/c3d57775-ddf9-302b-9dfe-c65967518d3c.jpg?_=3023236)

***
###<a id = "observer">观察者模式(observer)</a>

***
###<a id = "iterator">迭代子模式(iterator)</a>

***
###<a id = "chain_of_responsibility">责任链模式(chain of responsibility)</a>

***
###<a id = "command">命令模式(command)</a>

***
###<a id = "memento">备忘录模式(memento)</a>

***
###<a id = "state">状态设计模式(state)</a>

***
###<a id = "visitor">访问者模式(visitor)</a>

***
###<a id = "mediator">中介者模式(mediator)</a>

***
###<a id = "interpretor">解释器模式(interpretor)</a>

哈哈
