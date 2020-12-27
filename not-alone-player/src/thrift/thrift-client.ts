import { createHttpClient, HttpConnection } from '@creditkarma/thrift-client';
import * as request from 'request';
import { CoreOptions } from 'request';
import { Client } from '../codegen/common/GameService';

const CONFIG = {
  hostName: 'localhost',
  serviceName: 'game-service',
  port: 8045,
};

const thriftClient: Client<CoreOptions> = createHttpClient(Client, CONFIG);
const id: Promise<Number> = thriftClient.createGame(8);


thriftClient.add(5, 7, { headers: { 'X-Trace-Id': 'xxxxxx' } })
    .then((response: number) => {
        console.log(response);
        console.log(id);
    });


export class ThriftClient {

}





