package flightcompare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import flightcompare.DTO.FlightResponseDto;
import flightcompare.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {
@Autowired
private FlightService flightService;

@GetMapping("/all")
public List<FlightResponseDto> getAllFlights(@RequestParam(required = true) String source,
											@RequestParam(required = true) String destination,@RequestParam(required = true) String month) {
	 return flightService.getallFlight(source, destination, month);
}

@PostMapping("/create")
public List<FlightResponseDto> getFlightService() {
	List<FlightResponseDto> flt=flightService.createflights("DEL","BOM","2024-12");

	return flt;
}
}
