/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bibliotecaWeb.DAOs;

import br.edu.ifpr.bibliotecaWeb.Entities.Usuario;
import br.edu.ifpr.bibliotecaWeb.Factories.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author otavio
 */
public class UsuarioDAO {
    public void adcionar(Usuario u) throws SQLException{
        String sql = "INSERT INTO USUARIOS (nome, email, senha, curso, idade) VALUES (?, ?, ?, ?, ?)";
        System.out.println(u.getNome());
        Connection connection = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.setString(1, u.getNome());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getSenha());
        stmt.setString(4, u.getCurso());
        stmt.setInt(5, u.getIdade());
        
        stmt.execute();
        
        stmt.close();
        connection.close();
    }
}

/*
____________________██████
_________▓▓▓▓____█████████
__ Ƹ̵̡Ӝ̵̨̄Ʒ▓▓▓▓▓=▓____▓=▓▓▓▓▓
__ ▓▓▓_▓▓▓▓░●____●░░▓▓▓▓
_▓▓▓▓_▓▓▓▓▓░░__░░░░▓▓▓▓
_ ▓▓▓▓_▓▓▓▓░░♥__♥░░░▓▓▓
__ ▓▓▓___▓▓░░_____░░░▓▓
▓▓▓▓▓____▓░░_____░░▓
_ ▓▓____ ▒▓▒▓▒___ ████
_______ ▒▓▒▓▒▓▒_ ██████
_______▒▓▒▓▒▓▒ ████████
_____ ▒▓▒▓▒▓▒_██████ ███
_ ___▒▓▒▓▒▓▒__██████ _███
_▓▓X▓▓▓▓▓▓▓__██████_ ███
▓▓_██████▓▓__██████_ ███
▓_███████▓▓__██████_ ███
_████████▓▓__██████ _███
_████████▓▓__▓▓▓▓▓▓_▒▒
_████████▓▓__▓▓▓▓▓▓
_████████▓▓__▓▓▓▓▓▓
__████████▓___▓▓▓▓▓▓
_______▒▒▒▒▒____▓▓▓▓▓▓
_______▒▒▒▒▒ _____▓▓▓▓▓
_______▒▒▒▒▒_____ ▓▓▓▓▓
_______▒▒▒▒▒ _____▓▓▓▓▓
________▒▒▒▒______▓▓▓▓▓
________█████____█████
_'▀█║────────────▄▄───────────​─▄──▄_
──█║───────▄─▄─█▄▄█║──────▄▄──​█║─█║
──█║───▄▄──█║█║█║─▄║▄──▄║█║─█║​█║▄█║
──█║──█║─█║█║█║─▀▀──█║─█║█║─█║​─▀─▀
──█║▄║█║─█║─▀───────█║▄█║─▀▀
──▀▀▀──▀▀────────────▀─█║
───────▄▄─▄▄▀▀▄▀▀▄──▀▄▄▀
──────███████───▄▀
──────▀█████▀▀▄▀
────────▀█▀



*/