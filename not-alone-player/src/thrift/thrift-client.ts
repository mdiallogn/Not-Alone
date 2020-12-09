import { createHttpClient, HttpConnection } from '@creditkarma/thrift-client';
import * as request from 'request';
import { CoreOptions } from 'request';

import { Client } from '../codegen/common/GameService';

const CONFIG = {
  hostName: 'localhost',
  port: 8045,
};

const thriftClient: Client<CoreOptions> = createHttpClient(Client, CONFIG);

const id: Promise<Number> = thriftClient.createGame(8);

export class ThriftClient {}
