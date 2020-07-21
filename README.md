# vault-demo
In cli:

vault server -dev

export VAULT_ADDR='http://127.0.0.1:8200'

echo "WCD2g0e5gaLj+epo2iV3cWXxGrW6pUg2meVkquR4+fs=" > unseal.key

export VAULT_DEV_ROOT_TOKEN_ID=s.y3ROIoylGZjeAOAURIGA6H2H

vault kv put secret/vault-demo spring.datasource.username=root spring.datasource.password=root1234! spring.cloud.vault.token=s.IYQt4pYkEZY3Z286qBeKx8M2


