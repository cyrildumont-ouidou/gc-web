package fr.orsys.msa.gc;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

    private final ClientApi clientApi;

    @GetMapping
    public String listClients(Model model) throws UnknownHostException {
        model.addAttribute("hostName", InetAddress.getLocalHost().getHostName());
        model.addAttribute("clients",clientApi.findAll());
        return "clients";
    }

    @QueryMapping("clients")
    public List<Client> getClients(){
        return clientApi.findAll();
    }

}
