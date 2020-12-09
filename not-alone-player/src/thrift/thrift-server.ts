
import { GameService } from '../codegen/common/';
import { ClientServiceHandler } from '../handler/client-service-handler';
import * as express from 'express';
import { createThriftServer } from '@creditkarma/thrift-server-express';

const handler: ClientServiceHandler<express.Request> = new ClientServiceHandler<express.Request>();
const PORT = 8090;


export class ThriftServer {
  private app: express.Application;
  constructor() {
    this.app = createThriftServer({
      path: '/thrift',
      thriftOptions: {
        serviceName: 'calculator-service',
        handler: new GameService.Processor(handler),
      },
    });
    this.app.listen(PORT, () => {
      console.log(`Express server listening on port: ${PORT}`);
    });
  }
}

