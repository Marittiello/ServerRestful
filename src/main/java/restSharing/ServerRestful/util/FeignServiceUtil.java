package restSharing.ServerRestful.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value="feignDemo", url="http://localhost:8096/client")
public interface FeignServiceUtil {
	
	@GetMapping("/restart")
	public String restart();

}
