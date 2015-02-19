/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.devschool.principal.visao;

import br.com.devschool.cargo.visao.CargoFrame;
import br.com.devschool.entidade.Funcionario;
import br.com.devschool.forma_pagamento.visao.FormaPagamentoFrame;
import br.com.devschool.funcionario.visao.FuncionarioFrame;
import br.com.devschool.login.visao.LoginFrame;
import br.com.devschool.movimento_caixa.visao.FechamentoCaixaFrame;
import br.com.devschool.produto.servico.ProdutoServico;
import br.com.devschool.produto.visao.ProdutoFrame;
import br.com.devschool.terminal.visao.TerminalFrame;
import br.com.devschool.unidade_medida.visao.UnidadeMedidaFrame;
import br.com.devschool.util.FrameUtil;
import br.com.devschool.util.MensagemUtil;
import br.com.devschool.util.PDVException;
import br.com.devschool.venda.visao.VendaFrame;

/**
 *
 * @author ATILLA
 */
public class PrincipalFrame extends FrameUtil {

    /**
     * Creates new form PrincipalFrame
     * @throws br.com.devschool.util.PDVException
     */
    public PrincipalFrame() throws PDVException {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCargo = new javax.swing.JButton();
        jButtonFuncionario = new javax.swing.JButton();
        jButtonFormaPagamento = new javax.swing.JButton();
        jButtonProduto = new javax.swing.JButton();
        jButtonTerminal = new javax.swing.JButton();
        jButtonUnidadeMedida = new javax.swing.JButton();
        jButtonAbrirCaixa = new javax.swing.JButton();
        jButtonFecharCaixa = new javax.swing.JButton();
        jButtonCaixa2 = new javax.swing.JButton();
        jButtonVenda = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jButtonRelatorioProdutos = new javax.swing.JButton();
        jButtonRelatorio2 = new javax.swing.JButton();
        jButtonRelatorio3 = new javax.swing.JButton();
        jButtonRelatorio4 = new javax.swing.JButton();
        jLabelWallpaper = new javax.swing.JLabel();
        jMenuBarOpcoes = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemVenda = new javax.swing.JMenuItem();
        jMenuItemCargo = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemFormaPagamento = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuItemTerminal = new javax.swing.JMenuItem();
        jMenuItemUnidadeMedida = new javax.swing.JMenuItem();
        jMenuCaixa = new javax.swing.JMenu();
        jMenuItemAbrirCaixa = new javax.swing.JMenuItem();
        jMenuItemFecharCaixa = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButtonCargo.setText("Caso de Uso: Cargo");
        jButtonCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCargo);
        jButtonCargo.setBounds(40, 80, 200, 23);

        jButtonFuncionario.setText("Caso de Uso: Funcionário");
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFuncionario);
        jButtonFuncionario.setBounds(40, 120, 200, 23);

        jButtonFormaPagamento.setText("Caso de Uso: Forma de Pgto");
        jButtonFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFormaPagamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFormaPagamento);
        jButtonFormaPagamento.setBounds(40, 160, 200, 23);

        jButtonProduto.setText("Caso de Uso: Produto");
        jButtonProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonProduto);
        jButtonProduto.setBounds(40, 200, 200, 23);

        jButtonTerminal.setText("Caso de Uso: Terminal");
        jButtonTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminalActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTerminal);
        jButtonTerminal.setBounds(40, 240, 200, 23);

        jButtonUnidadeMedida.setText("Caso de Uso: Unidade de Medida");
        jButtonUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnidadeMedidaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUnidadeMedida);
        jButtonUnidadeMedida.setBounds(40, 280, 200, 23);

        jButtonAbrirCaixa.setText("Abrir Caixa");
        jPanel1.add(jButtonAbrirCaixa);
        jButtonAbrirCaixa.setBounds(300, 40, 200, 23);

        jButtonFecharCaixa.setText("Fechar Caixa");
        jButtonFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharCaixaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFecharCaixa);
        jButtonFecharCaixa.setBounds(300, 80, 200, 23);

        jButtonCaixa2.setText("Outra Opção de Caixa");
        jPanel1.add(jButtonCaixa2);
        jButtonCaixa2.setBounds(300, 120, 200, 23);

        jButtonVenda.setText("Caso de Uso: Venda");
        jButtonVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVenda);
        jButtonVenda.setBounds(40, 40, 200, 23);

        jButtonLogout.setText("Efetuar Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogout);
        jButtonLogout.setBounds(560, 40, 200, 23);

        jButtonRelatorioProdutos.setText("Relatório de Produtos");
        jButtonRelatorioProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRelatorioProdutos);
        jButtonRelatorioProdutos.setBounds(560, 80, 200, 23);

        jButtonRelatorio2.setText("Opção de Relatório");
        jPanel1.add(jButtonRelatorio2);
        jButtonRelatorio2.setBounds(560, 120, 200, 23);

        jButtonRelatorio3.setText("Opção de Relatório");
        jPanel1.add(jButtonRelatorio3);
        jButtonRelatorio3.setBounds(560, 160, 200, 23);

        jButtonRelatorio4.setText("Opção de Relatório");
        jPanel1.add(jButtonRelatorio4);
        jButtonRelatorio4.setBounds(560, 200, 200, 23);

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/system.jpg"))); // NOI18N
        jPanel1.add(jLabelWallpaper);
        jLabelWallpaper.setBounds(0, 0, 1920, 1080);

        jMenuCadastros.setText("Cadastros");

        jMenuItemVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemVenda.setText("Caso de Uso: Venda");
        jMenuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemVenda);

        jMenuItemCargo.setText("Caso de Uso: Cargo");
        jMenuItemCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCargo);

        jMenuItemFuncionario.setText("Caso de Uso: Funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemFuncionario);

        jMenuItemFormaPagamento.setText("Caso de Uso: Forma de Pagamento");
        jMenuItemFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormaPagamentoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemFormaPagamento);

        jMenuItemProduto.setText("Caso de Uso: Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemProduto);

        jMenuItemTerminal.setText("Caso de Uso: Terminal");
        jMenuItemTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTerminalActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemTerminal);

        jMenuItemUnidadeMedida.setText("Caso de Uso: Unidade de Medida");
        jMenuItemUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUnidadeMedidaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemUnidadeMedida);

        jMenuBarOpcoes.add(jMenuCadastros);

        jMenuCaixa.setText("Caixa");

        jMenuItemAbrirCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAbrirCaixa.setText("Abrir Caixa");
        jMenuCaixa.add(jMenuItemAbrirCaixa);

        jMenuItemFecharCaixa.setText("Fechar Caixa");
        jMenuItemFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFecharCaixaActionPerformed(evt);
            }
        });
        jMenuCaixa.add(jMenuItemFecharCaixa);

        jMenuBarOpcoes.add(jMenuCaixa);

        jMenuOpcoes.setText("Opções");

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemSair);

        jMenuBarOpcoes.add(jMenuOpcoes);

        setJMenuBar(jMenuBarOpcoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargoActionPerformed

        try {
            new CargoFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItemCargoActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed

        try {
            new FuncionarioFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed

        sair();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormaPagamentoActionPerformed
        
        try {
            new FormaPagamentoFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItemFormaPagamentoActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed

        try {
            new ProdutoFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTerminalActionPerformed
        
        try {
            new TerminalFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItemTerminalActionPerformed

    private void jMenuItemUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUnidadeMedidaActionPerformed

        try {
            new UnidadeMedidaFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItemUnidadeMedidaActionPerformed

    private void jButtonCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargoActionPerformed

        try {
            new CargoFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonCargoActionPerformed

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed

        try {
            new FuncionarioFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    private void jButtonFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFormaPagamentoActionPerformed

        try {
            new FormaPagamentoFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonFormaPagamentoActionPerformed

    private void jButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutoActionPerformed

        try {
            new ProdutoFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonProdutoActionPerformed

    private void jButtonTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminalActionPerformed

        try {
            new TerminalFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonTerminalActionPerformed

    private void jButtonUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnidadeMedidaActionPerformed

        try {
            new UnidadeMedidaFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonUnidadeMedidaActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed

        sair();
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharCaixaActionPerformed

        try {
            new FechamentoCaixaFrame().setVisible(Boolean.TRUE);
            dispose();
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonFecharCaixaActionPerformed

    private void jMenuItemFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFecharCaixaActionPerformed

        try {
            new FechamentoCaixaFrame().setVisible(Boolean.TRUE);
            dispose();
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItemFecharCaixaActionPerformed

    private void jButtonVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendaActionPerformed

        try {
            new VendaFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonVendaActionPerformed

    private void jMenuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendaActionPerformed

        try {
            new VendaFrame().setVisible(Boolean.TRUE);
        } catch (PDVException ex) {
            addMensagemErro(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItemVendaActionPerformed

    private void jButtonRelatorioProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioProdutosActionPerformed

        try {
            new ProdutoServico().gerarRelatorioJRXML();
        } catch (Exception e) {
            addMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jButtonRelatorioProdutosActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PrincipalFrame().setVisible(true);
                } catch (PDVException ex) {
                    MensagemUtil.addMensagemErro(ex.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirCaixa;
    private javax.swing.JButton jButtonCaixa2;
    private javax.swing.JButton jButtonCargo;
    private javax.swing.JButton jButtonFecharCaixa;
    private javax.swing.JButton jButtonFormaPagamento;
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonProduto;
    private javax.swing.JButton jButtonRelatorio2;
    private javax.swing.JButton jButtonRelatorio3;
    private javax.swing.JButton jButtonRelatorio4;
    private javax.swing.JButton jButtonRelatorioProdutos;
    private javax.swing.JButton jButtonTerminal;
    private javax.swing.JButton jButtonUnidadeMedida;
    private javax.swing.JButton jButtonVenda;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JMenuBar jMenuBarOpcoes;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuCaixa;
    private javax.swing.JMenuItem jMenuItemAbrirCaixa;
    private javax.swing.JMenuItem jMenuItemCargo;
    private javax.swing.JMenuItem jMenuItemFecharCaixa;
    private javax.swing.JMenuItem jMenuItemFormaPagamento;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTerminal;
    private javax.swing.JMenuItem jMenuItemUnidadeMedida;
    private javax.swing.JMenuItem jMenuItemVenda;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void sair() {
        FrameUtil.FUNCIONARIO_LOGADO = new Funcionario();
        new LoginFrame().setVisible(Boolean.TRUE);
        dispose();
    }
}
