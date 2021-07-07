package br.com.zup.propostaPix.cadastra

import br.com.zup.CadastraPixRequest
import br.com.zup.CadastraPixResponse
import br.com.zup.PropostaGrpcServiceGrpc
import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@Singleton
class PropostaGrpcEndpoint: PropostaGrpcServiceGrpc.PropostaGrpcServiceImplBase() {
    override fun cadastra(
        request: CadastraPixRequest,
        responseObserver: StreamObserver<CadastraPixResponse>
    ) {
        //transformando request em um Dto
        //val novaChave = request.toModel()

    }
}