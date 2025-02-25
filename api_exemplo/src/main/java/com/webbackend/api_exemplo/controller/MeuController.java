package com.webbackend.api_exemplo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webbackend.api_exemplo.model.NumeroDTO;

@RestController // É uma anotação do Spring Boot que indica que uma classe é um controlador REST
public class MeuController {

    @GetMapping(value = "/") /*
                              * Essa anotação define um endpoint GET acessível na raiz do servidor
                              * (http://localhost:8080/).
                              * Quando um usuário acessar essa URL, o método abaixo será executado e
                              * retornará a resposta.
                              */
    public String getMethodName() {
        return "Olá Mundo";
    }

    @GetMapping("/teste") /// Essa anotação define um endpoint GET acessível na URL /teste
    public String getData(@RequestParam(value = "param") String paramValue)
    /*
     * @RequestParam(value = "param") define um parâmetro chamado param na URL
     * (http://localhost:8080/teste?param=123)
     * Deve ser usado quando o parametro é opcional
     */
    {
        return "O valor do parâmetro é: " + paramValue;
    }

    @GetMapping("/testePath/{param}")
    public String getDataPath(@PathVariable("param") String paramValue)
    /*
     * @PathVariable("param") define um parâmetro chamado param na URL
     * (http://localhost:8080/testePath/123)
     * Deve ser usado quando o parametro é obrigatorio
     */

    {
        return "O valor do parâmetro é: " + paramValue;
    }

    @PostMapping("/somar") /*
                            * Essa anotação define um endpoint POST acessível na URL /somar.
                            * Esse método recebe dois parâmetros numéricos e retorna a soma deles.
                            */
    public Double somarPost(@RequestParam("n1") double number1, @RequestParam("n2") double number2)
    /*
     * @RequestParam("n1") e @RequestParam("n2") capturam dois valores da URL
     * Exemplo: no thunderbolt selecionar o metodo POST e digitar
     * http://localhost:8080/somar?n1=10&n2=5
     * Ambos os parâmetros são obrigatórios.
     */
    {
        return number1 + number2;
    }

    @PostMapping("/somarDTO") // Esse método recebe um objeto JSON no corpo da requisição e retorna a soma dos
                              // números.

    public Double createProduct(@RequestBody NumeroDTO numeros)
    /*
     * @RequestBody NumeroDTO numeros -> Captura um objeto enviado no corpo da
     * requisição.
     * O JSON deve estar no formato:
     * {
     * "numero1": 10,
     * "numero2": 5
     * }
     * Testar no thunder Client selecionar o metodo POST e digitar
     * http://localhost:8080/somarDTO
     */
    {
        return numeros.getNumero1() + numeros.getNumero2();
    }

    @PutMapping("/multiplicar") /*
                                 * Essa anotação define um endpoint PUT acessível na URL /multiplicar.
                                 * Esse método recebe dois parâmetros numéricos e retorna a multiplicação deles.
                                 */
    public double multiplyNumbers(@RequestParam("number1") double number1, @RequestParam("number2") double number2)
    /*
     * @RequestParam("number1") e @RequestParam("number2") capturam dois valores
     * Testar no Thunder Client selecionar o metodo PUT e digitar
     * Exemplo: http://localhost:8080/multiplicar?number1=10&number2=5
     * Ambos os parâmetros são obrigatórios.
     */
    {
        return number1 * number2;
    }

    @DeleteMapping("/produto/{id}") /*
                                     * Essa anotação define um endpoint DELETE acessível na URL /produto/{id}.
                                     * Esse método recebe um ID via parâmetro na URL e retorna uma mensagem de
                                     * exclusão.
                                     */
    public String deleteRecord(@PathVariable("id") Long id)
    /*
     * @PathVariable("id") captura o valor do parâmetro {id} da URL.
     * Exemplo: http://localhost:8080/produto/10
     * Nesse caso, o ID recebido será "10".
     */
    {
        return "Id excluído: " + id;
    }
}
