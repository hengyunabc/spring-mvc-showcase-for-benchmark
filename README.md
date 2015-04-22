Spring MVC path variable and parameter variable benchmark.
-------------------

**Add these @RequestMapping:**
```java
	@RequestMapping("/paravar")
	@ResponseBody
	public String path(String var) throws InterruptedException{
//		TimeUnit.MILLISECONDS.sleep(1);
		return var;
	}

	@RequestMapping("/pathvar/{var}")
	@ResponseBody
	public String path(@PathVariable String var) throws InterruptedException{
//		TimeUnit.MILLISECONDS.sleep(1);
		return var;
	}
```

**start tomcat**
```bash
mvn tomcat7:run -DskipTests
```

**benchamrk:**
```bash
ab -n 10000 -c 50 http://localhost:8080/spring-mvc-showcase/paravar?var=abc
ab -n 10000 -c 50 http://localhost:8080/spring-mvc-showcase/pathvar/abc
```

**result:**

```
Document Path:          /spring-mvc-showcase/paravar?var=abc
Requests per second:    8608.68 [#/sec] (mean)
```

```
Document Path:          /spring-mvc-showcase/pathvar/abc
Requests per second:    4637.04 [#/sec] (mean)
```

