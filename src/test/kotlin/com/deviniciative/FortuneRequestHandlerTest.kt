package com.deviniciative

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FortuneRequestHandlerTest {

    @Test
    fun testHandler() {
        val fortuneRequestHandler = FortuneRequestHandler()
        val pedido = Pedido()
        pedido.codigoPedido = "IN6000555"
        val luckCharm = fortuneRequestHandler.execute(pedido)
        Assertions.assertNotNull(luckCharm)
        Assertions.assertEquals(pedido.codigoPedido, luckCharm!!.pedido)
        Assertions.assertNotNull(luckCharm.fortune)
        fortuneRequestHandler.applicationContext.close()
    }
}