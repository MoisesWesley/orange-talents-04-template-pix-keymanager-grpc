package br.com.zup.propostaPix

import br.com.zup.TipoChave
import br.com.zup.TipoConta
import com.sun.istack.NotNull
import java.util.*
import javax.persistence.*

//aqui sera nossa classe que se tornada entidade no banco
@Entity
class ChavePix(
    //usamos @Field para especificar que e o campo que sera anotado com a restrição
    @field:NotNull
    val clienteId: UUID,

    @field:NotNull
    //variavel a sequir sera um tipo enum no banco de dados
    @Enumerated(EnumType.STRING)
    @Column(unique = false)
    val tipoChave: br.com.zup.propostaPix.TipoChave,

    @field:NotNull
    //tipo do campo unico, e nao pode ser nulo
    @Column(unique = true, nullable = false)
    val chave: String,

    @field:NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val tipoConta: br.com.zup.propostaPix.TipoConta,
) {
    @Id
    @GeneratedValue
    val id: UUID? = null

    override fun toString(): String {
        return "Id=$id, ChavePix(clienteId=$clienteId, TipoChave='$tipoChave', tipoConta=$tipoConta)"
    }
}