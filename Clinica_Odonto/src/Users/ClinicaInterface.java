/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.Date;

/**
 *
 * @author LucasPc
 */
public interface ClinicaInterface {
    /*
        CONSULTORIO ODONTOLÓGICO
        Cadastrar medicos, funcionario e clientes
        Clientes marcam e cancelam consultas
        Administrador adiciona, remove ou altera dados do cliente
        Administrador pesquisa e remarca Consultas
        'ADM':
        Busca - clientes cadastrados por cpf ou telefone
        Relatorio- intervalo de tempo ordenado por especialidade
    */
    public int AddCliente(Cliente _cliente);
    public int AddMedico(Medico _medico);
    public int AddFuncionario(Funcionario _funcionario);
    public int MarcarConsulta(String cpf, Date data);
    public int AlterarConsulta();
    public int CancelarConsulta();
    public int MostrarConsultas();
    public int PesquisarConsulta(String cpf);
    public int PesquisarUsuario(String termo, int parametro);
}
