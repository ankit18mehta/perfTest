package com.dtdl.perfTest.controller;

import java.util.List;

import javax.naming.ServiceUnavailableException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dtdl.perfTest.model.PESPods;
import com.dtdl.perfTest.repository.PESPodsRepository;

@RestController
@RequestMapping("/api")
public class PESPodsController {

	private static final Logger LOGGER = Logger.getLogger(PESPodsController.class);
	@Autowired
	private PESPodsRepository pesPodsRepository;

	@GetMapping("/pespods")
	@ResponseStatus(value=HttpStatus.OK)
	public List<PESPods> getAllPodsInfo() {
		LOGGER.info("getting list of all the collection records");
		return pesPodsRepository.findAll();
	}

	@PostMapping("/pespodinfo")
	public PESPods createPESPodsInfo(@RequestBody PESPods pesPodsinfo) {
		LOGGER.info("Saving Records to DB " +pesPodsinfo.toString() );
		return pesPodsRepository.save(pesPodsinfo);
	}

	@GetMapping("/generateException")
	@ResponseStatus(value=HttpStatus.SERVICE_UNAVAILABLE)
	public void generateException() throws ServiceUnavailableException {
		LOGGER.info("Custom Service Unavailable Exception");
		//throw new ServiceUnavailableException();

	}

}
