1.spring boot版本由2.0.5.RELEASE改为2.5.6

pom.xml增加：

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<scope>test</scope>
		</dependency>



2.MockMvc输出到控制台的是乱码

普通输出中文ok，但MockMvc输出乱码，解决方法参考：

\第 2-1 课： Spring Boot 对基础 Web 开发支持\spring-boot-web\src\test\java\com\neo\web\WebControllerTest.java

其它的项目不一一修改了



3.

