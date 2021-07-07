package br.com.zup.propostaPix

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class NovaChavepix(
    var clientId: String?,
    var tipoChave: TipoChave?,
    val chave: String?,
    val tipoConta: TipoConta?
) {
    fun toModel(ContaAssociada: ChavePix): ChavePix {
        return ChavePix(
            clienteId = UUID.fromString(this.clientId),
            tipoChave = TipoChave.valueOf(this.tipoChave!!.name),
            chave = if (this.tipoChave == TipoChave.ALEATORIA) UUID.randomUUID().toString() else this.chave!!,
            tipoConta = TipoConta.valueOf(this.tipoConta!!.name),
        )
    }
}