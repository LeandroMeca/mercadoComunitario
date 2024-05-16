package frames;

import dao.DaoCarrinho;
import dao.DaoConta;
import dao.DaoDataAtual;
import dao.DaoDatas;
import dao.DaoProdutoPereciveis;
import dao.DaoUsuario;
import dao.DaoUsuarioMembro;
import dao.DaoEnderecoFamilia;
import dao.DaoHigienePessoal;
import dao.DaoLimpeza;
import dao.DaoProdutoHortifruti;
import entity.Carrinho;
import entity.Datas;
import entity.Endereco;
import entity.ProdutoHigienePessoal;
import entity.ProdutoHortifruti;
import entity.ProdutoLimpeza;
import entity.ProdutoPereciveis;
import entity.UsuarioMembro;
import entity.Usuarios;
import static factory.Conections.createConnections;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class MainJFrame extends javax.swing.JFrame {

    int idParaRemoverRow;
    int idUsuario;
    int id;
    boolean controllerBtn;

    Object[] rowCarrinho;
    
    
    List<Usuarios> usuariosLista;
    List<Endereco> enderecoLista;

    DaoProdutoPereciveis daoProduto;
    DaoCarrinho daoCarrinho;
    DaoUsuario daoUsuario;
    DaoUsuarioMembro daoUsuarioMembro;
    DaoEnderecoFamilia daoEnderecoFamilia;
    DaoConta daoConta;
    DaoProdutoHortifruti daoProdutoHortifruti;
    DaoDatas daoDatas;
    DaoDataAtual daoDataAtual;
    DaoHigienePessoal daoHigienePessoal;
    DaoLimpeza daoLimpeza;

    DefaultTableModel tabelaUser;
    DefaultTableModel tabelaMembro;
    DefaultTableModel tabelaProduto;
    DefaultTableModel tabelaProdutoSaida;
    DefaultTableModel tabelaSaida;
    DefaultTableModel tabelaCarrinho;
    DefaultTableModel tabelaHotifruti;
    DefaultTableModel tabelaProdutoSaidaHotifruti;
    DefaultTableModel tabela_higiene;
    DefaultTableModel tabela_limpeza;

    DefaultComboBoxModel comboxPeresiveis;
    DefaultComboBoxModel comboxHortifruti;
    DefaultComboBoxModel comboxHigiene;
    DefaultComboBoxModel comboxLimpeza;

    int idFk;

    public MainJFrame() {

        initComponents();
        
        initComponentDisable();

        initDao();
        controllerBtn = true;
        jTextFieldBalanca.setEnabled(false);
        jButtonSaveMembers__.setEnabled(false);

        tabelaUser = (DefaultTableModel) jTableFatherFamily.getModel();
        tabelaMembro = (DefaultTableModel) jTableSon.getModel();
        tabelaProduto = (DefaultTableModel) jTableProduct.getModel();
        tabela_higiene = (DefaultTableModel) jTable_product_Higiene_.getModel();
        tabela_limpeza = (DefaultTableModel) jTable_product_limpeza_.getModel();

        tabelaProdutoSaida = (DefaultTableModel) jTableProdutoSaida.getModel();
//        tabelaProdutoSaidaHotifruti = (DefaultTableModel) jTableProdutoSaidaHortifruti.getModel();

        tabelaSaida = (DefaultTableModel) jTableSaida.getModel();
        tabelaCarrinho = (DefaultTableModel) jTableCarrinho.getModel();
        tabelaHotifruti = (DefaultTableModel) jTableProductHortifruti.getModel();

        comboxPeresiveis = (DefaultComboBoxModel) jComboBoxProduto.getModel();
        comboxHortifruti = (DefaultComboBoxModel) jComboBoxProdutoHortifruti.getModel();
        comboxHigiene = (DefaultComboBoxModel) jComboBoxProduto_Higiene_.getModel();
        comboxLimpeza = (DefaultComboBoxModel) jComboBox_produto_limpeza_.getModel();

        getdadosProdutosCadastradosPereciveis();
        getdadosProdutosCadastradosHortifruti();
        getdadosProdutosCadastradosHigiene();
        getdadosProdutosCadastradosLimpeza();

        getdadosTodosProdutos();
        getdadosProdutosHortifrutisaida();
        getdadosProdutosHigiene();
        getdadosProdutosLimpeza();

        getdadosProdutosHortifruti();
        getdadosProdutosPereciveis();
        getdadosProdutosLimpeza();
        getdadosProdutosSaida();

        usuariosLista = getdados();
        enderecoLista = getDadosEndereco();

        checkData();
    }
    
    
    private void initComponentDisable(){
        jButton_edit_usuario.setEnabled(false);
    }

    private void initDao() {
        daoDataAtual = new DaoDataAtual();
        daoProduto = new DaoProdutoPereciveis();
        daoCarrinho = new DaoCarrinho();
        daoUsuario = new DaoUsuario();
        daoUsuarioMembro = new DaoUsuarioMembro();
        daoEnderecoFamilia = new DaoEnderecoFamilia();
        daoConta = new DaoConta();
        daoProdutoHortifruti = new DaoProdutoHortifruti();
        daoDatas = new DaoDatas();
        daoHigienePessoal = new DaoHigienePessoal();
        daoLimpeza = new DaoLimpeza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldRgVenda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton_find = new javax.swing.JButton();
        jLabelGetNome = new javax.swing.JLabel();
        jLabelGetValor = new javax.swing.JLabel();
        jLabel_nao_encontrado_ = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableProdutoSaida = new javax.swing.JTable();
        jComboBoxOpcaoProduto = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldBalanca = new javax.swing.JTextField();
        jButton_add_checkout_ = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableCarrinho = new javax.swing.JTable();
        jButtonFinalizarCompra__ = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableSaida = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_nome_titular_ = new javax.swing.JLabel();
        jTextField_nome_dependente__ = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButtonSaveMembers__ = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton_Salvar_tiltular__ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFatherFamily = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabelRendaFamilia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAdress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jTextFieldRg = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField_telefone_ = new javax.swing.JTextField();
        jLabel_endereco_ = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTextFieldNameEdit = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabelRg1 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextFieldIdadeEdit = new javax.swing.JTextField();
        jTextField_telefone_Edit = new javax.swing.JTextField();
        jTextFieldAdressEdit = new javax.swing.JTextField();
        jTextFieldRgEdit = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jButton_edit_usuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButtonSaveProduct__ = new javax.swing.JButton();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldProduct = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextField_mercearia_peso_atualizacao_ = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField_preco_atualizacao_mercearia = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField_produto_atualizacao_quantidade = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProduct = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableProductHortifruti = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelNome2 = new javax.swing.JLabel();
        jTextFieldProductHortifruti = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldPrecoHortifruti = new javax.swing.JTextField();
        jButtonSaveProduct_Hortifruti___ = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jComboBoxProdutoHortifruti = new javax.swing.JComboBox<>();
        jButtonProdutoHortifrutiAtualizacao = new javax.swing.JButton();
        jLabelPrecoHortifruti = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jButtonSaveProduct__1 = new javax.swing.JButton();
        jTextField_preco_higiene_ = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextFieldPeso_higiene_ = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldProduct_higiene_ = new javax.swing.JTextField();
        jLabelNome_produto_higiene = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jComboBoxProduto_Higiene_ = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jTextField_Peso_Higiene_Atualizacao_ = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField_Preco_Atualizacao_higiene_ = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField_higiene_quantidade_atualizacao_ = new javax.swing.JTextField();
        jButton_save_atualizacao_higiene_ = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_product_Higiene_ = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jButton_save_product_limpeza_ = new javax.swing.JButton();
        jTextField_preco_limpeza_ = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField_peso_limpeza_ = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField_product_limpeza_ = new javax.swing.JTextField();
        jLabelNome_produto_higiene1 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jComboBox_produto_limpeza_ = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jTextField_peso_limpeza_atualizacao_1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField_preco_atualizacao_limpeza_ = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField_limpeza_quantidade_atualizacao_ = new javax.swing.JTextField();
        jButton_save_atualizacao_limpeza_ = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable_product_limpeza_ = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 768));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(102, 102, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BUSCAR USUARIO");
        jLabel12.setOpaque(true);

        jTextFieldRgVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldRgVenda.setNextFocusableComponent(jButton_find);
        jTextFieldRgVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRgVendaActionPerformed(evt);
            }
        });
        jTextFieldRgVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRgVendaKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("RG");

        jButton_find.setText("BUSCAR");
        jButton_find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_find.setNextFocusableComponent(jComboBoxOpcaoProduto);
        jButton_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_findActionPerformed(evt);
            }
        });

        jLabelGetNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelGetNome.setText("NOME");

        jLabelGetValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelGetValor.setText("VALOR");

        jLabel_nao_encontrado_.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel_nao_encontrado_.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jTextFieldRgVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelGetNome, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGetValor, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nao_encontrado_, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_nao_encontrado_, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton_find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldRgVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addComponent(jLabelGetNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelGetValor)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jTableProdutoSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableProdutoSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "PESO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProdutoSaida.setNextFocusableComponent(jTextFieldBalanca);
        jTableProdutoSaida.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jTableProdutoSaidaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTableProdutoSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoSaidaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableProdutoSaida);
        if (jTableProdutoSaida.getColumnModel().getColumnCount() > 0) {
            jTableProdutoSaida.getColumnModel().getColumn(0).setResizable(false);
            jTableProdutoSaida.getColumnModel().getColumn(1).setResizable(false);
            jTableProdutoSaida.getColumnModel().getColumn(2).setMinWidth(80);
            jTableProdutoSaida.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        jComboBoxOpcaoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MERCEARIA", "HORTIFRUTI", "HIGIENE PESSOAL", "LIMPEZA" }));
        jComboBoxOpcaoProduto.setNextFocusableComponent(jTableProdutoSaida);
        jComboBoxOpcaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcaoProdutoActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(102, 102, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TODOS PRODUTOS");
        jLabel21.setOpaque(true);

        jLabel13.setText("PESO DA BALANÇA");

        jTextFieldBalanca.setNextFocusableComponent(jButton_add_checkout_);

        jButton_add_checkout_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_add_checkout_.setText("ADICIONAR");
        jButton_add_checkout_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add_checkout_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_checkout_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jComboBoxOpcaoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jTextFieldBalanca, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_add_checkout_)))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxOpcaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldBalanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_add_checkout_)))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(102, 102, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CARRINHO");
        jLabel10.setOpaque(true);

        jTableCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "PESO/UNI", "PRECO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCarrinhoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableCarrinho);
        if (jTableCarrinho.getColumnModel().getColumnCount() > 0) {
            jTableCarrinho.getColumnModel().getColumn(0).setResizable(false);
            jTableCarrinho.getColumnModel().getColumn(1).setMinWidth(150);
            jTableCarrinho.getColumnModel().getColumn(1).setMaxWidth(150);
            jTableCarrinho.getColumnModel().getColumn(2).setMinWidth(80);
            jTableCarrinho.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        jButtonFinalizarCompra__.setBackground(new java.awt.Color(102, 255, 102));
        jButtonFinalizarCompra__.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonFinalizarCompra__.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizarCompra__.setText("FINALIZAR");
        jButtonFinalizarCompra__.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonFinalizarCompra__.setContentAreaFilled(false);
        jButtonFinalizarCompra__.setOpaque(true);
        jButtonFinalizarCompra__.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCompra__ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFinalizarCompra__, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFinalizarCompra__, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jTableSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USUARIO", "PRODUTO", "PESO", "PRECO", "DATA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableSaida);
        if (jTableSaida.getColumnModel().getColumnCount() > 0) {
            jTableSaida.getColumnModel().getColumn(2).setMinWidth(60);
            jTableSaida.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTableSaida.getColumnModel().getColumn(2).setMaxWidth(60);
            jTableSaida.getColumnModel().getColumn(3).setMinWidth(60);
            jTableSaida.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTableSaida.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        jLabel11.setBackground(new java.awt.Color(102, 102, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SAÍDAS");
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("CHECKOUT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("CHECKOUT", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jTableSon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableSon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableSon);
        if (jTableSon.getColumnModel().getColumnCount() > 0) {
            jTableSon.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEMBROS DA FAMILIA");
        jLabel1.setOpaque(true);

        jLabel_nome_titular_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_nome_titular_.setText("NOME TITULAR");

        jTextField_nome_dependente__.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_nome_dependente__KeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("NOME:");

        jButtonSaveMembers__.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSaveMembers__.setText("ADICIONAR MEMBRO");
        jButtonSaveMembers__.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveMembers__ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_nome_dependente__, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_nome_titular_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSaveMembers__)))
                .addGap(15, 15, 15))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_nome_titular_, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nome_dependente__, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonSaveMembers__)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jButton_Salvar_tiltular__.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Salvar_tiltular__.setText("GUARDAR");
        jButton_Salvar_tiltular__.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Salvar_tiltular__ActionPerformed(evt);
            }
        });

        jTableFatherFamily.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableFatherFamily.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "IDADE", "RG", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFatherFamily.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFatherFamilyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFatherFamily);
        if (jTableFatherFamily.getColumnModel().getColumnCount() > 0) {
            jTableFatherFamily.getColumnModel().getColumn(0).setResizable(false);
            jTableFatherFamily.getColumnModel().getColumn(1).setMinWidth(50);
            jTableFatherFamily.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableFatherFamily.getColumnModel().getColumn(1).setMaxWidth(50);
            jTableFatherFamily.getColumnModel().getColumn(2).setMinWidth(120);
            jTableFatherFamily.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTableFatherFamily.getColumnModel().getColumn(2).setMaxWidth(120);
            jTableFatherFamily.getColumnModel().getColumn(3).setMinWidth(100);
            jTableFatherFamily.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableFatherFamily.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VALOR FAMILIAR");

        jLabelRendaFamilia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRendaFamilia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRendaFamilia.setText("RS0.00 ");
        jLabelRendaFamilia.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("NOME");

        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldAdress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("ENDEREÇO");

        jTextFieldIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("IDADE");

        jLabelRg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRg.setText("RG");

        jTextFieldRg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel23.setBackground(new java.awt.Color(102, 102, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CADASTRAR USUARIO");
        jLabel23.setOpaque(true);

        jLabel32.setText("TELEFONE");

        jTextField_telefone_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel55.setText("ENDEREÇO:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAdress)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_telefone_)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addContainerGap())))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_endereco_, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Salvar_tiltular__, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRendaFamilia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_telefone_, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabelRg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabelRendaFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jButton_Salvar_tiltular__, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_endereco_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("USUARIOS");

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jTextFieldNameEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("NOME");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("ENDEREÇO");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("IDADE");

        jLabelRg1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRg1.setText("RG");

        jLabel53.setText("TELEFONE");

        jTextFieldIdadeEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldIdadeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeEditActionPerformed(evt);
            }
        });

        jTextField_telefone_Edit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldAdressEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextFieldRgEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel54.setBackground(new java.awt.Color(102, 102, 255));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("EDITAR USUARIO");
        jLabel54.setOpaque(true);

        jButton_edit_usuario.setText("GUARDAR");
        jButton_edit_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(7, 7, 7))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRg1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldRgEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAdressEdit)
                    .addComponent(jTextFieldNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldIdadeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_telefone_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_edit_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAdressEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldIdadeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_telefone_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRgEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButton_edit_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 312, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("USUARIOS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("SALVAR NOVO PRODUTO PERECIVEL");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jButtonSaveProduct__.setText("GUARDAR");
        jButtonSaveProduct__.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveProduct__ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("PRECO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("PESO");

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNome.setText("NOME");

        jLabel9.setBackground(new java.awt.Color(102, 102, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" CADASTRAR PRODUTO");
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addComponent(jTextFieldProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonSaveProduct__)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonSaveProduct__)
                .addGap(19, 19, 19))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setBackground(new java.awt.Color(102, 102, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" ATUALIZAR ESTOQUE PERECIVEL");
        jLabel17.setOpaque(true);

        jComboBoxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProdutoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("PESO");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("PRECO");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("QUANTIDADE");

        jButton4.setText("SALVAR ATUALIZAÇÂO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE))
                                .addComponent(jTextField_mercearia_peso_atualizacao_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_produto_atualizacao_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_preco_atualizacao_mercearia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_mercearia_peso_atualizacao_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_preco_atualizacao_mercearia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_produto_atualizacao_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setBackground(new java.awt.Color(102, 102, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" NOVOS  PRODUTOS");
        jLabel16.setOpaque(true);

        jTableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "PESO", "PRECO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableProduct);
        if (jTableProduct.getColumnModel().getColumnCount() > 0) {
            jTableProduct.getColumnModel().getColumn(0).setResizable(false);
            jTableProduct.getColumnModel().getColumn(1).setResizable(false);
            jTableProduct.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MERCEARIA", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("SALVAR NOVO PRODUTO HORTIFRUI");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTableProductHortifruti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "PRECO", "DISPONIVEL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProductHortifruti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductHortifrutiMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTableProductHortifruti);
        if (jTableProductHortifruti.getColumnModel().getColumnCount() > 0) {
            jTableProductHortifruti.getColumnModel().getColumn(0).setResizable(false);
            jTableProductHortifruti.getColumnModel().getColumn(1).setResizable(false);
            jTableProductHortifruti.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel29.setBackground(new java.awt.Color(102, 102, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("NOVOS  PRODUTOS");
        jLabel29.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(362, 225));

        jLabelNome2.setText("NOME");

        jLabel27.setText("PRECO");

        jButtonSaveProduct_Hortifruti___.setText("GUARDAR");
        jButtonSaveProduct_Hortifruti___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveProduct_Hortifruti___ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(102, 102, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("CADASTRAR");
        jLabel25.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonSaveProduct_Hortifruti___)
                        .addComponent(jTextFieldPrecoHortifruti, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldProductHortifruti, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabelNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldProductHortifruti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPrecoHortifruti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSaveProduct_Hortifruti___)
                .addGap(16, 16, 16))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setText("ATUALIZAR ESTOQUE HORTIFRUI");

        jComboBoxProdutoHortifruti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProdutoHortifrutiActionPerformed(evt);
            }
        });

        jButtonProdutoHortifrutiAtualizacao.setText("SALVAR ATUALIZAÇÂO");
        jButtonProdutoHortifrutiAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoHortifrutiAtualizacaoActionPerformed(evt);
            }
        });

        jLabelPrecoHortifruti.setBackground(new java.awt.Color(204, 204, 204));
        jLabelPrecoHortifruti.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrecoHortifruti.setEnabled(false);
        jLabelPrecoHortifruti.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(102, 102, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ATUALIZAR");
        jLabel24.setOpaque(true);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jButtonProdutoHortifrutiAtualizacao)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrecoHortifruti, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProdutoHortifruti, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxProdutoHortifruti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPrecoHortifruti, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonProdutoHortifrutiAtualizacao)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HORTIFRUTI", jPanel4);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jButtonSaveProduct__1.setText("GUARDAR");
        jButtonSaveProduct__1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveProduct__1ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("PRECO");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("PESO/UNI/ML");

        jLabelNome_produto_higiene.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNome_produto_higiene.setText("NOME");

        jLabel35.setBackground(new java.awt.Color(102, 102, 255));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText(" CADASTRAR PRODUTO");
        jLabel35.setOpaque(true);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_preco_higiene_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPeso_higiene_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addComponent(jTextFieldProduct_higiene_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonSaveProduct__1)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelNome_produto_higiene, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabelNome_produto_higiene)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProduct_higiene_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPeso_higiene_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_preco_higiene_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonSaveProduct__1)
                .addGap(19, 19, 19))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setBackground(new java.awt.Color(102, 102, 255));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText(" ATUALIZAR ESTOQUE HIGIENE PESSOAL");
        jLabel36.setOpaque(true);

        jComboBoxProduto_Higiene_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProduto_Higiene_ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setText("PESO/UNI/ML");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("PRECO");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setText("QUANTIDADE");

        jButton_save_atualizacao_higiene_.setText("SALVAR ATUALIZAÇÂO");
        jButton_save_atualizacao_higiene_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_atualizacao_higiene_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxProduto_Higiene_, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE))
                                .addComponent(jTextField_Peso_Higiene_Atualizacao_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_save_atualizacao_higiene_)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_higiene_quantidade_atualizacao_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_Preco_Atualizacao_higiene_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxProduto_Higiene_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Peso_Higiene_Atualizacao_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Preco_Atualizacao_higiene_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_higiene_quantidade_atualizacao_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_save_atualizacao_higiene_)
                .addGap(23, 23, 23))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel40.setBackground(new java.awt.Color(102, 102, 255));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText(" NOVOS  PRODUTOS");
        jLabel40.setOpaque(true);

        jTable_product_Higiene_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "PESO", "PRECO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable_product_Higiene_);
        if (jTable_product_Higiene_.getColumnModel().getColumnCount() > 0) {
            jTable_product_Higiene_.getColumnModel().getColumn(0).setResizable(false);
            jTable_product_Higiene_.getColumnModel().getColumn(1).setResizable(false);
            jTable_product_Higiene_.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("HIGIENE PESSOAL");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HIGIENE PESSOAL", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jButton_save_product_limpeza_.setText("GUARDAR");
        jButton_save_product_limpeza_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_product_limpeza_ActionPerformed(evt);
            }
        });

        jTextField_preco_limpeza_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_preco_limpeza_ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setText("PRECO");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setText("PESO/UNI/ML");

        jLabelNome_produto_higiene1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNome_produto_higiene1.setText("NOME");

        jLabel43.setBackground(new java.awt.Color(102, 102, 255));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText(" CADASTRAR PRODUTO");
        jLabel43.setOpaque(true);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_preco_limpeza_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_peso_limpeza_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addComponent(jTextField_product_limpeza_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton_save_product_limpeza_)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelNome_produto_higiene1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabelNome_produto_higiene1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_product_limpeza_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_peso_limpeza_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_preco_limpeza_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton_save_product_limpeza_)
                .addGap(19, 19, 19))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setBackground(new java.awt.Color(102, 102, 255));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText(" ATUALIZAR ESTOQUE LIMPEZA");
        jLabel44.setOpaque(true);

        jComboBox_produto_limpeza_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_produto_limpeza_ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setText("PESO/UNI/ML");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setText("PRECO");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setText("QUANTIDADE");

        jButton_save_atualizacao_limpeza_.setText("SALVAR ATUALIZAÇÂO");
        jButton_save_atualizacao_limpeza_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_atualizacao_limpeza_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox_produto_limpeza_, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE))
                                .addComponent(jTextField_peso_limpeza_atualizacao_1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_save_atualizacao_limpeza_)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_limpeza_quantidade_atualizacao_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_preco_atualizacao_limpeza_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_produto_limpeza_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_peso_limpeza_atualizacao_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_preco_atualizacao_limpeza_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_limpeza_quantidade_atualizacao_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_save_atualizacao_limpeza_)
                .addGap(23, 23, 23))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setBackground(new java.awt.Color(102, 102, 255));
        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText(" NOVOS  PRODUTOS");
        jLabel48.setOpaque(true);

        jTable_product_limpeza_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "PESO", "PRECO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable_product_limpeza_);
        if (jTable_product_limpeza_.getColumnModel().getColumnCount() > 0) {
            jTable_product_limpeza_.getColumnModel().getColumn(0).setResizable(false);
            jTable_product_limpeza_.getColumnModel().getColumn(1).setResizable(false);
            jTable_product_limpeza_.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("LIMPEZA");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LIMPEZA", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Salvar_tiltular__ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Salvar_tiltular__ActionPerformed

        if (!jTextFieldName.getText().equals("")
                && !jTextFieldRg.getText().equals("")
                && !jTextFieldIdade.getText().equals("") && !jTextFieldAdress.getText().equals("")) {

            jButtonSaveMembers__.setEnabled(false);
            id = daoUsuario.saveUsuario(jTextFieldName.getText(), Integer.parseInt(jTextFieldIdade.getText()),
                    jTextFieldRg.getText(), jTextField_telefone_.getText());

            daoConta.savarConta(id, new BigDecimal(70.00));
            daoEnderecoFamilia.saveEndereco(id, jTextFieldAdress.getText());
            JOptionPane.showMessageDialog(null, "concluido");
            
            usuariosLista = getdados();
            enderecoLista = getDadosEndereco();
            
            List<Usuarios> saveUsuarioPoo = daoUsuario.saveUsuarioPoo(id, jTextFieldName.getText(), jTextFieldIdade.getText(),
                    jTextFieldRg.getText(), jTextField_telefone_.getText());

            jTextFieldName.setText("");
            jTextFieldRg.setText("");
            jTextFieldIdade.getText();
            jTextFieldAdress.setText("");
            jTextFieldIdade.setText("");
            jTextField_telefone_.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Preecher todos os campos");
        }


    }//GEN-LAST:event_jButton_Salvar_tiltular__ActionPerformed

    private void jTableFatherFamilyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFatherFamilyMouseClicked
        jButtonSaveMembers__.setEnabled(true);
        int selectedRow = jTableFatherFamily.getSelectedRow();

        String rg = (String) tabelaUser.getValueAt(selectedRow, 2);
        jLabel_nome_titular_.setText("NOME TITULAR: "+(String) tabelaUser.getValueAt(selectedRow, 0));

        idUsuario = getIdUsuario(rg);
        jLabel_endereco_.setText(daoEnderecoFamilia.getEndereco(idUsuario).toUpperCase());
      
        if (idUsuario != 0) {
            getdadosMembros(idUsuario);
            jLabelRendaFamilia.setText("" + getRenda(idUsuario));
            jButton_edit_usuario.setEnabled(true);
        }
        
        // edit
        for (int i = 0; i < usuariosLista.size(); i++) {
            if(tabelaUser.getValueAt(selectedRow, 0).equals(usuariosLista.get(i).getNome())){
            Usuarios usuarioEdit = usuariosLista.get(i);
            
                jTextFieldNameEdit.setText(usuarioEdit.getNome());
                jTextFieldAdressEdit.setText(jLabel_endereco_.getText());
                jTextFieldIdadeEdit.setText(usuarioEdit.getIdade());
                jTextField_telefone_Edit.setText(usuarioEdit.getTelefone());
                jTextFieldRgEdit.setText(usuarioEdit.getRg());
                
            }
        }
        
       

    }//GEN-LAST:event_jTableFatherFamilyMouseClicked

    private void jButtonSaveMembers__ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveMembers__ActionPerformed

        if (!jTextField_nome_dependente__.getText().equals("") && idUsuario!=0) {
            jButtonSaveMembers__.setEnabled(false);
            daoUsuarioMembro.saveUsuarioMembro(idUsuario, jTextField_nome_dependente__.getText());

            int quantidadeFamilia = getdadosMembros(idUsuario);
            System.out.println("quantidde " + quantidadeFamilia);
            if (quantidadeFamilia > 3) {
                updateConta(idUsuario, new BigDecimal(100.00));
            } else {
                updateConta(idUsuario, new BigDecimal(70.00));
            }
            JOptionPane.showMessageDialog(null, "Cadastrado");
        }else{
            jTextField_nome_dependente__.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "DIITE O NOME");
        }

    }//GEN-LAST:event_jButtonSaveMembers__ActionPerformed

    private void jTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdadeActionPerformed

    private void jButtonSaveProduct__ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveProduct__ActionPerformed
        // salvar produto

        daoProduto.saveProdutoPerecivel(jTextFieldProduct.getText(), Double.parseDouble(jTextFieldPeso.getText()), new BigDecimal(jTextFieldPreco.getText()));
        daoProduto.saveProdutoCadastrados_pereciveis(1, jTextFieldProduct.getText(), Double.parseDouble(jTextFieldPeso.getText()), new BigDecimal(jTextFieldPreco.getText()));
        //  salvarTransacaoEntrada();
        //    getdadosProdutosPereciveis();
        getdadosProdutosCadastradosPereciveis();
        getdadosTodosProdutos();
        getdadosProdutosPereciveis();
        JOptionPane.showMessageDialog(null, "GUARDADO");
    }//GEN-LAST:event_jButtonSaveProduct__ActionPerformed

    private void jTextFieldRgVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRgVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRgVendaActionPerformed

    private void jTableProdutoSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoSaidaMouseClicked
        //get produto para carrinho

        idParaRemoverRow = jTableProdutoSaida.getSelectedRow();

        String produto = (String) jTableProdutoSaida.getValueAt(idParaRemoverRow, 0);
        double peso = (double) jTableProdutoSaida.getValueAt(idParaRemoverRow, 1);
        BigDecimal preco = (BigDecimal) jTableProdutoSaida.getValueAt(idParaRemoverRow, 2);

        rowCarrinho = new Object[3];

        rowCarrinho[0] = produto;
        rowCarrinho[1] = peso;
        rowCarrinho[2] = preco;
    }//GEN-LAST:event_jTableProdutoSaidaMouseClicked

    private void jButton_add_checkout_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_checkout_ActionPerformed
        // adicionar no carrinho
        if (!jLabelGetNome.getText().equals("NOME")) {
            double pesoBalanca = 0;
            if (!jComboBoxOpcaoProduto.getSelectedItem().equals("HORTIFRUTI")) {
                pesoBalanca = 1.0;
            } else {
                pesoBalanca = Double.parseDouble(jTextFieldBalanca.getText());
            }
            String nomeProduto = rowCarrinho[0].toString();
            BigDecimal valor = new BigDecimal(rowCarrinho[2].toString());

            // preço div peso total * peso cal;
            BigDecimal calculado = valor.divide(new BigDecimal(1.000)).multiply(new BigDecimal(pesoBalanca));

            rowCarrinho[0] = nomeProduto;

            rowCarrinho[2] = calculado.setScale(2, RoundingMode.DOWN);

            if (jComboBoxOpcaoProduto.getSelectedItem().equals("HORTIFRUTI")) {
                rowCarrinho[1] = jTextFieldBalanca.getText();
            } else {

            }

            tabelaCarrinho.addRow(rowCarrinho);
            if (jTextFieldBalanca.getText() != null) {
                jTextFieldBalanca.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR BUSQUE O USUARIO !!!");
        }
    }//GEN-LAST:event_jButton_add_checkout_ActionPerformed

    private void jButtonFinalizarCompra__ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCompra__ActionPerformed
        // realizar compra
        if (tabelaCarrinho.getRowCount() > 0) {

            BigDecimal soma = BigDecimal.ZERO;
            for (int i = 0; i < tabelaCarrinho.getRowCount(); i++) {
                soma = soma.add(new BigDecimal(tabelaCarrinho.getValueAt(i, 2).toString()));
            }

            BigDecimal calculaFinal = new BigDecimal(soma.toString());
            BigDecimal ValueCurrency = new BigDecimal(jLabelGetValor.getText());
            BigDecimal subtract = ValueCurrency.subtract(calculaFinal);

            if (subtract.signum() >= 0) {

                finalizarCompra(idFk, subtract);

                salvarTransacaoSaida(idFk);

                salvarBaixaDoProduto(idFk, jLabelGetNome.getText(), rowCarrinho[0].toString(), Double.parseDouble(rowCarrinho[1].toString()), soma);

                baixaProduto();

                tabelaCarrinho.setRowCount(0);
                tabelaCarrinho.setRowCount(0);

                getdadosProdutosSaida();
                getdadosTodosProdutos();
                getdadosProdutosCadastradosPereciveis();
                getdadosProdutosPereciveis();
                getdadosProdutosLimpeza();

                JOptionPane.showMessageDialog(null, "FINALIZADO");

            } else {
                JOptionPane.showMessageDialog(null, "FICOU FALTANDO " + subtract.abs() + " REAIS");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ADICIONAR UM ITEM AO CARRINHO PARA REALIZAR A COMPRA");
        }
    }//GEN-LAST:event_jButtonFinalizarCompra__ActionPerformed

    private void jButton_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_findActionPerformed
        // pegar cliente
        controllerBtn = true;

        if (controllerBtn) {
            controllerBtn = false;
            idFk = getIdUsuario(jTextFieldRgVenda.getText());
            List<Usuarios> cliente = daoUsuario.getCliente(jTextFieldRgVenda.getText());
            if (!cliente.isEmpty()) {
                jLabelGetNome.setText(cliente.get(0).getNome());
                jLabelGetValor.setText("" + getRenda(idFk));
            } else {
                jTextFieldRgVenda.setBorder(BorderFactory.createLineBorder(Color.RED));

                jLabel_nao_encontrado_.setText("NÃO ENCONTRADO");

                jTextFieldRgVenda.setText("");
            }
        }
    }//GEN-LAST:event_jButton_findActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // atualizar produtos
        daoProduto.saveProdutoCadastrados_pereciveis(Integer.parseInt(jTextField_produto_atualizacao_quantidade.getText()), (String) jComboBoxProduto.getSelectedItem(), Double.parseDouble(jTextField_mercearia_peso_atualizacao_.getText()), new BigDecimal(jTextField_preco_atualizacao_mercearia.getText()));
        getdadosProdutosPereciveis();
        getdadosTodosProdutos();
        JOptionPane.showMessageDialog(null, "GUARDADO");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBoxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProdutoActionPerformed
        if (jComboBoxProduto.getSelectedItem() != null) {
            getProdutoMerceariaParaAtualizar(jComboBoxProduto.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jComboBoxProdutoActionPerformed

    private void jButtonSaveProduct_Hortifruti___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveProduct_Hortifruti___ActionPerformed
        daoProdutoHortifruti.saveProdutoHortifruti(jTextFieldProductHortifruti.getText(), 1.000, new BigDecimal(jTextFieldPrecoHortifruti.getText()));
        getdadosProdutosHortifruti();
        getdadosProdutosCadastradosHortifruti();
        JOptionPane.showMessageDialog(null, "GUARDADO");
    }//GEN-LAST:event_jButtonSaveProduct_Hortifruti___ActionPerformed

    private void jComboBoxProdutoHortifrutiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProdutoHortifrutiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProdutoHortifrutiActionPerformed

    private void jButtonProdutoHortifrutiAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutoHortifrutiAtualizacaoActionPerformed
        daoProdutoHortifruti.saveProdutoHortifruti(jTextFieldProductHortifruti.getText(), 1.000, new BigDecimal(jTextFieldPrecoHortifruti.getText()));
        JOptionPane.showMessageDialog(null, "GUARDADO");
    }//GEN-LAST:event_jButtonProdutoHortifrutiAtualizacaoActionPerformed

    private void jComboBoxOpcaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcaoProdutoActionPerformed
        if (jComboBoxOpcaoProduto.getSelectedItem().equals("HORTIFRUTI")) {
            jTableProdutoSaida.getColumnModel().getColumn(1).setHeaderValue("PESO");
            jTextFieldBalanca.setEnabled(true);
        } else {
            jTextFieldBalanca.setEnabled(false);
        }
        getdadosTodosProdutos();
    }//GEN-LAST:event_jComboBoxOpcaoProdutoActionPerformed

    private void jTableCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCarrinhoMouseClicked
        // remove item com click
        int selectedRow = jTableCarrinho.getSelectedRow();
        tabelaCarrinho.removeRow(selectedRow);
    }//GEN-LAST:event_jTableCarrinhoMouseClicked

    private void jTableProductHortifrutiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductHortifrutiMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTableProductHortifruti.getSelectedRow();
        String alimento = (String) tabelaHotifruti.getValueAt(selectedRow, 0);
        boolean disponivel = (boolean) tabelaHotifruti.getValueAt(selectedRow, 2);

        daoProdutoHortifruti.setDisponibilidadeHortifruti(alimento, disponivel);
        getdadosTodosProdutos();
    }//GEN-LAST:event_jTableProductHortifrutiMouseClicked

    private void jButtonSaveProduct__1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveProduct__1ActionPerformed
        // TODO add your handling code here:
        daoHigienePessoal.saveProdutoHigienePessoal(jTextFieldProduct_higiene_.getText(), Double.parseDouble(jTextFieldPeso_higiene_.getText()),
                new BigDecimal(jTextField_preco_higiene_.getText()));
        daoHigienePessoal.saveProdutoCadastrados_higiene(1, jTextFieldProduct_higiene_.getText(), Double.parseDouble(jTextFieldPeso_higiene_.getText()), new BigDecimal(jTextField_preco_higiene_.getText()));
        
        getdadosProdutosCadastradosHigiene();
        getdadosTodosProdutos();
        getdadosProdutosHigiene();
        JOptionPane.showMessageDialog(null, "GUARDADO");
    }//GEN-LAST:event_jButtonSaveProduct__1ActionPerformed

    private void jComboBoxProduto_Higiene_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProduto_Higiene_ActionPerformed
        if (jComboBoxProduto_Higiene_.getSelectedItem() != null) {
            getProdutoHigieneParaAtualizar(jComboBoxProduto_Higiene_.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jComboBoxProduto_Higiene_ActionPerformed

    private void jButton_save_atualizacao_higiene_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_atualizacao_higiene_ActionPerformed
        //higiene pessoal

        daoHigienePessoal.saveProdutoCadastrados_higiene(Integer.parseInt(jTextField_higiene_quantidade_atualizacao_.getText()), (String) jComboBoxProduto_Higiene_.getSelectedItem(), Double.parseDouble(jTextField_Peso_Higiene_Atualizacao_.getText()), new BigDecimal(jTextField_Preco_Atualizacao_higiene_.getText()));
        getdadosProdutosHigiene();
        getdadosTodosProdutos();
        JOptionPane.showMessageDialog(null, "GUARDADO");
    }//GEN-LAST:event_jButton_save_atualizacao_higiene_ActionPerformed

    private void jButton_save_product_limpeza_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_product_limpeza_ActionPerformed
        // save limpeza
        daoLimpeza.saveProdutoLimpeza(jTextField_product_limpeza_.getText(), Double.parseDouble(jTextField_peso_limpeza_.getText()),
                new BigDecimal(jTextField_preco_limpeza_.getText()));
        daoLimpeza.save_produto_cadastrados_limpeza(1, jTextField_product_limpeza_.getText(), Double.parseDouble(jTextField_peso_limpeza_.getText()), new BigDecimal(jTextField_preco_limpeza_.getText()));
        getdadosProdutosCadastradosLimpeza();
        getdadosTodosProdutos();

        getdadosProdutosLimpeza();
        JOptionPane.showMessageDialog(null, "GUARDADO");
    }//GEN-LAST:event_jButton_save_product_limpeza_ActionPerformed

    private void jComboBox_produto_limpeza_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_produto_limpeza_ActionPerformed
        // jcombox limpeza
        if (jComboBox_produto_limpeza_.getSelectedItem() != null) {
            getProdutoLimpezaParaAtualizar(jComboBox_produto_limpeza_.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jComboBox_produto_limpeza_ActionPerformed

    private void jButton_save_atualizacao_limpeza_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_atualizacao_limpeza_ActionPerformed
        // save atualizacao limpeza
        daoLimpeza.save_produto_cadastrados_limpeza(Integer.parseInt(jTextField_limpeza_quantidade_atualizacao_.getText()), (String) jComboBox_produto_limpeza_.getSelectedItem(), Double.parseDouble(jTextField_peso_limpeza_atualizacao_1.getText()), new BigDecimal(jTextField_preco_atualizacao_limpeza_.getText()));
        getdadosProdutosLimpeza();
        getdadosTodosProdutos();
        JOptionPane.showMessageDialog(null, "GUARDADO");
    }//GEN-LAST:event_jButton_save_atualizacao_limpeza_ActionPerformed

    private void jTextField_preco_limpeza_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_preco_limpeza_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_preco_limpeza_ActionPerformed

    private void jTableProdutoSaidaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableProdutoSaidaAncestorMoved

    }//GEN-LAST:event_jTableProdutoSaidaAncestorMoved

    private void jTextFieldRgVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRgVendaKeyReleased
        // 
        jLabel_nao_encontrado_.setText("");
        jTextFieldRgVenda.setBorder(BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_jTextFieldRgVendaKeyReleased

    private void jTextField_nome_dependente__KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nome_dependente__KeyReleased
       //trandform field border default
       jTextField_nome_dependente__.setBorder(BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_jTextField_nome_dependente__KeyReleased

    private void jTextFieldIdadeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdadeEditActionPerformed

    private void jButton_edit_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_usuarioActionPerformed
        // edit user
        
        Usuarios usuariosEdit = new Usuarios(idUsuario, jTextFieldNameEdit.getText(), jTextFieldIdadeEdit.getText(),
                jTextFieldRgEdit.getText(), jTextField_telefone_Edit.getText());
        
        Endereco endereco = new Endereco(idUsuario,jTextFieldAdressEdit.getText() );
        
        daoUsuario.updateUsuario(usuariosEdit);
        
        daoEnderecoFamilia.updateEndereco(endereco);
        usuariosLista = getdados();
      
        jTextField_telefone_Edit.setText("");
        jTextFieldNameEdit.setText("");
        jTextFieldIdadeEdit.setText("");
        jTextFieldAdressEdit.setText("");
        jTextFieldRgEdit.setText("");
        
        
        
        jButton_edit_usuario.setEnabled(false);
        
    }//GEN-LAST:event_jButton_edit_usuarioActionPerformed

    //******************************************************************************************************************
    //PRODUTOS
    //******************************************************************************************************************
    private void getdadosProdutosSaida() {
        tabelaSaida.setRowCount(0);
        List<Carrinho> cliente = daoCarrinho.getDadosCarrinho();
        if (!cliente.isEmpty()) {
            List<Datas> dataSaidaCarrinho = daoDatas.getDataSaidaCarrinho();
            Object[] row = new Object[5];

            for (int i = 0; i < cliente.size(); i++) {

                row[0] = cliente.get(i).getNome();
                row[1] = cliente.get(i).getProduto();
                row[2] = cliente.get(i).getPeso();
                row[3] = cliente.get(i).getPreco();
                row[4] = dataSaidaCarrinho.get(i).getDataSaidaString();
                tabelaSaida.addRow(row);

            }
        }

    }

    private void getdadosTodosProdutos() {
        tabelaProdutoSaida.setRowCount(0);

        List<ProdutoPereciveis> clientePereciveis = null;
        List<ProdutoHortifruti> clienteHortifruti = null;
        List<ProdutoHigienePessoal> higienePessoal = null;
        List<ProdutoLimpeza> limpeza = null;

        if (jComboBoxOpcaoProduto.getSelectedItem().equals("MERCEARIA")) {
            clientePereciveis = daoProduto.getProduto();
            Object[] row = new Object[3];
            for (int i = 0; i < clientePereciveis.size(); i++) {

                row[0] = clientePereciveis.get(i).getNomeProduto();
                row[1] = clientePereciveis.get(i).getPeso();
                row[2] = clientePereciveis.get(i).getPreco();

                tabelaProdutoSaida.addRow(row);

            }
        }
        if (jComboBoxOpcaoProduto.getSelectedItem().equals("HORTIFRUTI")) {
            clienteHortifruti = daoProdutoHortifruti.getProdutoCadastradosHortifruti();
            Object[] row = new Object[3];

            for (int i = 0; i < clienteHortifruti.size(); i++) {
                boolean disponibilidade = clienteHortifruti.get(i).getDisponibilidade();
                if (disponibilidade && jComboBoxOpcaoProduto.getSelectedItem().equals("HORTIFRUTI")) {
                    row[0] = clienteHortifruti.get(i).getNomeProduto();
                    row[1] = clienteHortifruti.get(i).getPeso();
                    row[2] = clienteHortifruti.get(i).getPreco();

                    tabelaProdutoSaida.addRow(row);
                }
                if (jComboBoxOpcaoProduto.getSelectedItem().equals("MERCEARIA")) {
                    row[0] = clienteHortifruti.get(i).getNomeProduto();
                    row[1] = clienteHortifruti.get(i).getPeso();
                    row[2] = clienteHortifruti.get(i).getPreco();

                    tabelaProdutoSaida.addRow(row);
                }

            }
        }
        if (jComboBoxOpcaoProduto.getSelectedItem().equals("LIMPEZA")) {
            jTableProdutoSaida.getColumnModel().getColumn(1).setHeaderValue("UNID");
            limpeza = daoLimpeza.getProdutoCadastrados();
            Object[] row = new Object[3];
            for (int i = 0; i < limpeza.size(); i++) {

                row[0] = limpeza.get(i).getNomeProduto();
                row[1] = limpeza.get(i).getPesoUniMl();
                row[2] = limpeza.get(i).getPreco();

                tabelaProdutoSaida.addRow(row);

            }
        }
        if (jComboBoxOpcaoProduto.getSelectedItem().equals("HIGIENE PESSOAL")) {
            jTableProdutoSaida.getColumnModel().getColumn(1).setHeaderValue("UNID");
            List<ProdutoHigienePessoal> higiene = daoHigienePessoal.getProduto();
            Object[] row = new Object[3];
            for (int i = 0; i < higiene.size(); i++) {

                row[0] = higiene.get(i).getNomeProduto();
                row[1] = higiene.get(i).getPesoUniMl();
                row[2] = higiene.get(i).getPreco();

                tabelaProdutoSaida.addRow(row);

            }
        }

    }

    private void getdadosProdutosHortifrutisaida() {
        //  tabelaProdutoSaidaHotifruti.setRowCount(0);
        List<ProdutoHortifruti> cliente = daoProdutoHortifruti.getProdutoHortifruti();

        Object[] row = new Object[3];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNomeProduto();
            row[1] = cliente.get(i).getPreco();

            //  tabelaProdutoSaidaHotifruti.addRow(row);
        }

    }

    private void getdadosProdutosHortifruti() {
        tabelaHotifruti.setRowCount(0);
        List<ProdutoHortifruti> cliente = daoProdutoHortifruti.getProdutoHortifruti();

        Object[] row = new Object[3];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNomeProduto();
            row[1] = cliente.get(i).getPreco();
            row[2] = cliente.get(i).getDisponibilidade();

            tabelaHotifruti.addRow(row);
        }

    }

    private void getdadosProdutosPereciveis() {
        tabelaProduto.setRowCount(0);
        List<ProdutoPereciveis> cliente = daoProduto.getProduto();

        Object[] row = new Object[3];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNomeProduto();
            row[1] = cliente.get(i).getPeso();
            row[2] = cliente.get(i).getPreco();

            tabelaProduto.addRow(row);
        }

    }

    private void getdadosProdutosHigiene() {
        tabela_higiene.setRowCount(0);
        List<ProdutoHigienePessoal> cliente = daoHigienePessoal.getProduto();

        Object[] row = new Object[3];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNomeProduto();
            row[1] = cliente.get(i).getPesoUniMl();
            row[2] = cliente.get(i).getPreco();

            tabela_higiene.addRow(row);
        }

    }

    private void getdadosProdutosLimpeza() {
        tabela_limpeza.setRowCount(0);
        List<ProdutoLimpeza> cliente = daoLimpeza.getProduto();

        Object[] row = new Object[3];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNomeProduto();
            row[1] = cliente.get(i).getPesoUniMl();
            row[2] = cliente.get(i).getPreco();

            tabela_limpeza.addRow(row);
        }

    }

    private void getdadosProdutosCadastradosPereciveis() {
        comboxPeresiveis.removeAllElements();
        List<ProdutoPereciveis> cliente = daoProduto.getProdutoCadastrados();

        Object[] row = new Object[3];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNomeProduto();
            row[1] = cliente.get(i).getPeso();
            row[2] = cliente.get(i).getPreco();

            comboxPeresiveis.addElement(row[0]);
        }

    }

    private void getdadosProdutosCadastradosHigiene() {
        comboxHigiene.removeAllElements();
        List<ProdutoHigienePessoal> cliente = daoHigienePessoal.getProduto_Higiene_Cadastrados();

        Object[] row = new Object[3];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNomeProduto();
            row[1] = cliente.get(i).getPesoUniMl();
            row[2] = cliente.get(i).getPreco();

            comboxHigiene.addElement(row[0]);
        }

    }

    private void getdadosProdutosCadastradosHortifruti() {
        comboxHortifruti.removeAllElements();
        List<ProdutoHortifruti> cliente = daoProdutoHortifruti.getProdutoCadastradosHortifruti();

        Object[] row = new Object[3];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNomeProduto();
            row[1] = cliente.get(i).getPreco();
            row[2] = cliente.get(i).getDisponibilidade();

            comboxHortifruti.addElement(row[0]);
        }

    }

    private void getdadosProdutosCadastradosLimpeza() {
        comboxLimpeza.removeAllElements();
        List<ProdutoLimpeza> cliente = daoLimpeza.getProdutoCadastrados();

        Object[] row = new Object[3];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNomeProduto();
            row[1] = cliente.get(i).getPesoUniMl();
            row[2] = cliente.get(i).getPreco();

            comboxLimpeza.addElement(row[0]);
        }

    }

    private List<Usuarios> getdados() {
        tabelaUser.setRowCount(0);
        List<Usuarios> cliente = daoUsuario.getCliente();

        Object[] row = new Object[4];

        for (int i = 0; i < cliente.size(); i++) {
            row[0] = cliente.get(i).getNome();
            row[1] = cliente.get(i).getIdade();
            row[2] = cliente.get(i).getRg();
            row[3] = cliente.get(i).getTelefone();
            tabelaUser.addRow(row);
        }
        return cliente;
    }

    private void getdados(String dados) {

    }

    private int getdadosMembros(int idMembro) {
        tabelaMembro.setRowCount(0);
        List<UsuarioMembro> usuarioMembro = daoUsuarioMembro.getIdUsuarioMembro(idMembro);
        Object[] row = new Object[1];
        int a = 1;
        for (int i = 0; i < usuarioMembro.size(); i++) {

            row[0] = usuarioMembro.get(i).getNomeMembro();
           
            tabelaMembro.addRow(row);
            a += 1;
        }
        return a;
    }

    private int getIdUsuario(String rg) {
        int idReturn = 0;
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from pessoa where rg = '" + rg + "'";
            rs = st.executeQuery(sql);
            while (rs.next()) {

                idReturn = rs.getInt("id");

            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return idReturn;

    }

    private BigDecimal getRenda(int idConta) {
        BigDecimal valor = null;
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;

        try {
            st = con.createStatement();
            String sql = "select * from conta where id = '" + idConta + "'";
            rs = st.executeQuery(sql);

            while (rs.next()) {

                valor = rs.getBigDecimal("valor");

            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return valor;

    }

    private void updateConta(int idMembro, BigDecimal valor) {
        Connection con;
        // BigDecimal renda = getRenda(idMembro);
        con = createConnections();
        Statement st;
        try {
            st = con.createStatement();
            // String sql = "update conta set valor = " + renda.add(valor) + " where id =" + idMembro + " ";
            String sql = "update conta set valor = " + valor + " where id =" + idMembro + " ";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }

    }

    private void updateContaPrincipal(int id, BigDecimal valor) {
        Connection con;
        // BigDecimal renda = getRenda(idMembro);
        con = createConnections();
        Statement st;
        try {
            st = con.createStatement();
            // String sql = "update conta set valor = " + renda.add(valor) + " where id =" + idMembro + " ";
            String sql = "update conta set valor = " + valor + " where id =" + id + " ";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }

    }

    private void finalizarCompra(int idGetConta, BigDecimal soma) {
        Connection con;
        con = createConnections();
        Statement st;
        try {
            st = con.createStatement();
            String sql = "update conta set valor = " + soma + " where id =" + idGetConta + " ";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }
    }

    private void salvarTransacaoEntrada() {
        Connection con;
        con = createConnections();
        Statement st;

        try {
            st = con.createStatement();
            String sql = "insert into data_transacao(data_inicial) values('" + LocalDateTime.now() + "')";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir data de transicao " + ex);
        }

    }

    private void salvarTransacaoSaida(int idTransacao) {
//        Connection con;
//        con = createConnections();
//        Statement st;
//
//        try {
//            st = con.createStatement();
//            String sql = "update data_transacao set data_final = '" + LocalDateTime.now() + "' where id = " + idTransacao + "";
//            st.execute(sql);
//
//        } catch (SQLException ex) {
//            System.out.println("erro ao inserir data de transicao " + ex);
//        }

        Connection con;
        con = createConnections();
        Statement st;

        try {
            st = con.createStatement();
            String sql = "insert into data_transacao(idfk,data_final) values(" + idTransacao + ",'" + LocalDateTime.now() + "')";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir data de transicao " + ex);
        }

    }

    private void salvarBaixaDoProduto(int idFk, String usuario, String produto, double peso, BigDecimal precos) {
        Connection con;

        con = createConnections();

        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into produto_carrinho(idfk,usuario,nome,peso,preco) values(" + idFk + ",'" + usuario + "','" + produto + "'," + peso + "," + precos + ")";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }

    }

    private void getProdutoHigieneParaAtualizar(String selectedItem) {

        List<ProdutoHigienePessoal> cliente = daoHigienePessoal.getProdutoCadastrados(selectedItem);

        for (int i = 0; i < cliente.size(); i++) {
            jTextField_Peso_Higiene_Atualizacao_.setText("" + cliente.get(i).getPesoUniMl());
            jTextField_Preco_Atualizacao_higiene_.setText("" + cliente.get(i).getPreco());

        }
    }

    private void getProdutoLimpezaParaAtualizar(String selectedItem) {

        List<ProdutoLimpeza> cliente = daoLimpeza.getProdutoCadastrados(selectedItem);

        for (int i = 0; i < cliente.size(); i++) {
            jTextField_peso_limpeza_atualizacao_1.setText("" + cliente.get(i).getPesoUniMl());
            jTextField_preco_atualizacao_limpeza_.setText("" + cliente.get(i).getPreco());

        }
    }

    private void getProdutoMerceariaParaAtualizar(String selectedItem) {

        List<ProdutoPereciveis> produtoCadastrados = daoProduto.getProdutoCadastrados(selectedItem);

        for (int i = 0; i < produtoCadastrados.size(); i++) {
            jTextField_mercearia_peso_atualizacao_.setText("" + produtoCadastrados.get(i).getPeso());
            jTextField_preco_atualizacao_mercearia.setText("" + produtoCadastrados.get(i).getPreco());

        }
    }

    private void getProdutoParaAtualizarHortifruti(String selectedItem) {

        List<ProdutoHortifruti> cliente = daoProdutoHortifruti.getProdutoCadastradosHortifruti(selectedItem);

        for (int i = 0; i < cliente.size(); i++) {
            jLabelPrecoHortifruti.setText("" + cliente.get(i).getPreco());

        }
    }

    private void baixaProduto() {
        for (int i = 0; i < tabelaCarrinho.getRowCount(); i++) {
            String valueAt = tabelaCarrinho.getValueAt(i, 0).toString();
            System.out.println("tabela carrinho " + valueAt + " " + i);
            daoProduto.deleteProduto(valueAt);
            daoLimpeza.deleteProduto(valueAt);
            daoHigienePessoal.deleteProduto(valueAt);
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonFinalizarCompra__;
    private javax.swing.JButton jButtonProdutoHortifrutiAtualizacao;
    private javax.swing.JButton jButtonSaveMembers__;
    private javax.swing.JButton jButtonSaveProduct_Hortifruti___;
    private javax.swing.JButton jButtonSaveProduct__;
    private javax.swing.JButton jButtonSaveProduct__1;
    private javax.swing.JButton jButton_Salvar_tiltular__;
    private javax.swing.JButton jButton_add_checkout_;
    private javax.swing.JButton jButton_edit_usuario;
    private javax.swing.JButton jButton_find;
    private javax.swing.JButton jButton_save_atualizacao_higiene_;
    private javax.swing.JButton jButton_save_atualizacao_limpeza_;
    private javax.swing.JButton jButton_save_product_limpeza_;
    private javax.swing.JComboBox<String> jComboBoxOpcaoProduto;
    private javax.swing.JComboBox<String> jComboBoxProduto;
    private javax.swing.JComboBox<String> jComboBoxProdutoHortifruti;
    private javax.swing.JComboBox<String> jComboBoxProduto_Higiene_;
    private javax.swing.JComboBox<String> jComboBox_produto_limpeza_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelGetNome;
    private javax.swing.JLabel jLabelGetValor;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome2;
    private javax.swing.JLabel jLabelNome_produto_higiene;
    private javax.swing.JLabel jLabelNome_produto_higiene1;
    private javax.swing.JLabel jLabelPrecoHortifruti;
    private javax.swing.JLabel jLabelRendaFamilia;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelRg1;
    private javax.swing.JLabel jLabel_endereco_;
    private javax.swing.JLabel jLabel_nao_encontrado_;
    private javax.swing.JLabel jLabel_nome_titular_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCarrinho;
    private javax.swing.JTable jTableFatherFamily;
    private javax.swing.JTable jTableProduct;
    private javax.swing.JTable jTableProductHortifruti;
    private javax.swing.JTable jTableProdutoSaida;
    private javax.swing.JTable jTableSaida;
    private javax.swing.JTable jTableSon;
    private javax.swing.JTable jTable_product_Higiene_;
    private javax.swing.JTable jTable_product_limpeza_;
    private javax.swing.JTextField jTextFieldAdress;
    private javax.swing.JTextField jTextFieldAdressEdit;
    private javax.swing.JTextField jTextFieldBalanca;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldIdadeEdit;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameEdit;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPeso_higiene_;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldPrecoHortifruti;
    private javax.swing.JTextField jTextFieldProduct;
    private javax.swing.JTextField jTextFieldProductHortifruti;
    private javax.swing.JTextField jTextFieldProduct_higiene_;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldRgEdit;
    private javax.swing.JTextField jTextFieldRgVenda;
    private javax.swing.JTextField jTextField_Peso_Higiene_Atualizacao_;
    private javax.swing.JTextField jTextField_Preco_Atualizacao_higiene_;
    private javax.swing.JTextField jTextField_higiene_quantidade_atualizacao_;
    private javax.swing.JTextField jTextField_limpeza_quantidade_atualizacao_;
    private javax.swing.JTextField jTextField_mercearia_peso_atualizacao_;
    private javax.swing.JTextField jTextField_nome_dependente__;
    private javax.swing.JTextField jTextField_peso_limpeza_;
    private javax.swing.JTextField jTextField_peso_limpeza_atualizacao_1;
    private javax.swing.JTextField jTextField_preco_atualizacao_limpeza_;
    private javax.swing.JTextField jTextField_preco_atualizacao_mercearia;
    private javax.swing.JTextField jTextField_preco_higiene_;
    private javax.swing.JTextField jTextField_preco_limpeza_;
    private javax.swing.JTextField jTextField_product_limpeza_;
    private javax.swing.JTextField jTextField_produto_atualizacao_quantidade;
    private javax.swing.JTextField jTextField_telefone_;
    private javax.swing.JTextField jTextField_telefone_Edit;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables

    private void checkData() {

        String checkData = daoDataAtual.checkData();

        if (checkData == null) {
            checkData = "00";
        }

        int parseInt = Integer.parseInt(checkData); // ultima data inserida no banco
        int monthValue = LocalDateTime.now().getMonthValue(); //data atual

        if (parseInt != monthValue) {
            System.out.println("igual");
            List<Usuarios> cliente = daoUsuario.getCliente();

            for (int i = 0; i < cliente.size(); i++) {

                int id1 = cliente.get(i).getId();
                int d = daoUsuarioMembro.getIdUsuarioMembroForUpdate(id1);

                if (d > 2) {
                    System.out.println("update principal " + i + "   " + d);
                    updateConta(id1, new BigDecimal(100.00));
                }
                if (d < 2) {

                    System.out.println("update principal " + i + "   " + d);
                    updateConta(id1, new BigDecimal(70.00));
                    updateContaPrincipal(id1, new BigDecimal(70.00));
                }
            }
        } else {
            System.out.println("datas diferentes");

        }

        daoDataAtual.salvarDataAtual();

    }

    private List<Endereco> getDadosEndereco() {
        List<Endereco> enderecoList = daoEnderecoFamilia.getEndereco();
        return enderecoList;
    }

}
