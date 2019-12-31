
package com.br.cirilo.FoiBrinks.resources;
import com.br.cirilo.FoiBrinks.models.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;
import com.br.cirilo.FoiBrinks.repository.ProdutoRepository;
import com.br.cirilo.FoiBrinks.models.Produtos;
import com.br.cirilo.FoiBrinks.models.Venda;
import com.br.cirilo.FoiBrinks.repository.ClientesRepository;
import com.br.cirilo.FoiBrinks.repository.VendaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController 
@RequestMapping(value="/api")
@Api(value="API REST Loja TaDeBrinks ")
@CrossOrigin(origins="*")
@PersistenceContext
public class ProdutoResource implements ErrorController {
    @Autowired
    ProdutoRepository produtoRepository;
    
  private EntityManager em;
    @Autowired
  ClientesRepository clientesRepository;
    @Autowired
    VendaRepository vendaRepository;
    @ApiOperation(value="Retorna o teste da API")
       
    @GetMapping("/teste")
    public String teste(){
        return "Api Rest da Loja TaDeBrinks";
    }
    
    @ApiOperation(value="Retorna a lista de Produtos")
    @GetMapping("/produtos")
    
    public List<Produtos> listarProdutos(){
       return produtoRepository.findAll();
    
    }   
    
    @ApiOperation(value="Retorna a lista de Clientes")

    @GetMapping("/clientes")

    public List<Clientes> listarClientes(){
        return clientesRepository.findAll();
    }
    @ApiOperation(value="Salva Cliente")

    @PostMapping("/clientes")
    public Clientes salvarClientes(@RequestBody Clientes clientes){
       return clientesRepository.save(clientes);
    }
    
    
    
    @ApiOperation(value="Apaga Cliente")

    @DeleteMapping("/clientes")
    
    public void deletarCliente(@RequestBody Clientes cliente){
         clientesRepository.delete(cliente);
    }
    
    
    
    @ApiOperation(value="Apaga Cliente")
    @PutMapping("/clientes")
    public void atualizaCliente(@RequestBody Clientes cliente){
         clientesRepository.save(cliente);
    }
    
    @ApiOperation(value="Salva os produtos")
    @PostMapping("/produtos")
    public Produtos salvarProduto(@RequestBody Produtos produto){
       return produtoRepository.save(produto);
    }
    /*@ApiOperation(value="Lista o produto pelo ID")
    @GetMapping("/produtos/{id}")
    public Optional<Produtos> listarProdutoUnico(@PathVariable(value="id") Integer id){
        return produtoRepository.findById(id);
    }*/
    @ApiOperation(value="Apaga o produto")
    @DeleteMapping("/produtos")
    public void deletarProduto(@RequestBody Produtos produto){
         produtoRepository.delete(produto);
    }
    @ApiOperation(value="Atualiza o produto")
    @PutMapping("produtos")
    public Produtos atualizaProduto(@RequestBody Produtos produto){
       return  produtoRepository.save(produto);
    }

    @ApiOperation(value="Retorna as Vendas Efetuadas")
    @GetMapping("/vendas")
    public List<Venda> listarvendas(){
       return vendaRepository.findAll();
    
    } 
    
    
    
    
    @Override
    public String getErrorPath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
