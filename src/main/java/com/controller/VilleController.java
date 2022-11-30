package com.controller;

import com.dao.VilleDAOImpl;
import com.dto.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
public class VilleController {
    @Autowired
    VilleDAOImpl villeDAO;


    @RequestMapping(value = "/ville", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Ville> get(@RequestParam(required = false, value="codePostal") String codePostal) throws SQLException {

        System.out.println("get 2");

        ArrayList<Ville> listeVille = villeDAO.findAllVilles();

        return listeVille;
    }
}
