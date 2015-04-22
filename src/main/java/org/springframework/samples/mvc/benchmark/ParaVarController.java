package org.springframework.samples.mvc.benchmark;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParaVarController {
	
	@RequestMapping("/paravar")
	@ResponseBody
	public String path(String var) throws InterruptedException{
//		TimeUnit.MILLISECONDS.sleep(1);
		return var;
	}

}
