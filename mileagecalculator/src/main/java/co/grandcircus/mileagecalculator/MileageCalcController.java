package co.grandcircus.mileagecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageCalcController {

	// Here is the URL path
	@RequestMapping("/")
	public ModelAndView home() {
		// the name of the j s p goes in the quotes below
		return new ModelAndView("home");
	}

	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("form");
		return mv;
	}

	@RequestMapping("/result")
	public ModelAndView Result(@RequestParam("MPG") double MPG, @RequestParam("Gallons") double Gallons) {

		double result = MPG * Gallons;

		ModelAndView mav = new ModelAndView("result");
//		mav.setViewName("addition-result"); - or can do it this way
		mav.addObject("MPG", MPG);
		mav.addObject("Gallons", Gallons);
		mav.addObject("result", result);
		return mav;
	}
}
