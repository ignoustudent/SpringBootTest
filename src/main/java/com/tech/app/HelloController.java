/**
 * 
 */
package com.tech.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rakesh Singh
 *
 */

@RestController
public class HelloController {

	
	@GetMapping(value="/hello")
	public String helloWorld(){
		return "Hello Welcome to Ignou";
	}
}
